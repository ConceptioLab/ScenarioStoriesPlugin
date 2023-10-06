
// Generated on 28.04.2023 at 03:41:43 BRT by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.scenariostories.design.service;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesFactory;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioStoriesFolder;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.capella.vp.scenariostories.design.service.ScenarioStoriesOpenJavaService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class ScenariostoriesOpenJavaService {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public ScenariostoriesOpenJavaService() {
		// TODO Auto-generated method stub
	}
	
	public ScenarioStoriesFolder getFolder(EObject any) {
		EObject container = any;
		while(!(container instanceof ScenarioStoriesFolder)) {
			container = container.eContainer();
		}
		return (ScenarioStoriesFolder)container;
	}
	
	
	public ScenarioStoriesFolder getDefaultScenariosFolder(EObject any, DDiagram diagram, boolean create) {
		OperationalAnalysis oa = any instanceof OperationalAnalysis ? (OperationalAnalysis) any :
			(OperationalAnalysis) EcoreUtil2.getFirstContainer(any, OaPackage.Literals.OPERATIONAL_ANALYSIS);
		
		if (oa == null) {
			return null;
		}
		 
		ScenarioStoriesFolder folder = getScenariosFolder(oa, diagram);
		if(folder != null) {
			return folder;
		}
		
		if(create) {
			folder = ScenariostoriesFactory.eINSTANCE.createScenarioStoriesFolder();
			folder.setName(diagram.getName().concat(" [Folder]"));
			folder.getDiagramUIDs().add(diagram.getUid());
			oa.getOwnedExtensions().add(folder);
			return folder;
		}
		return null;
	}
	
	public ScenarioStoriesFolder getScenariosFolder(OperationalAnalysis oa, DDiagram diagram) {
		EList<ElementExtension> ext =  oa.getOwnedExtensions();
		for(ElementExtension elem : ext) {
			if(elem instanceof ScenarioStoriesFolder &&
				((ScenarioStoriesFolder)elem).getDiagramUIDs().get(0).equals(diagram.getUid())	) {
				return (ScenarioStoriesFolder)elem;
			}	
		}	
		return null;
	  }
	
	public EList<EObject> getSemanticChildren(EObject any){
		return any.eContents();
	}
	
	public boolean canElementBeShown(EObject any, DDiagram diagram) {
		// Check if element is inside a folder which unique identifier matches the diagram.
		ScenarioStoriesFolder folder = getDefaultScenariosFolder(any, diagram, false);
		return folder == getFolder(any) ? true : false;
	}
	
	public String getLabel(EObject any) {
        if(any instanceof NamedElement) {
        	NamedElement component = (NamedElement) any;
            String label = new String();
            return label.concat(component.getName()).concat(": ").concat(component.getSummary());
        }
        return null;
    }
}