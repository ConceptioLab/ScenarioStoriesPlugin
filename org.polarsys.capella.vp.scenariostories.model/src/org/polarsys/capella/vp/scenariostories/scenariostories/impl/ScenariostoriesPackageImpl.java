
package org.polarsys.capella.vp.scenariostories.scenariostories.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;

import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;

import org.polarsys.capella.core.data.epbs.EpbsPackage;

import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;

import org.polarsys.capella.core.data.la.LaPackage;

import org.polarsys.capella.core.data.oa.OaPackage;

import org.polarsys.capella.core.data.pa.PaPackage;

import org.polarsys.capella.core.data.requirement.RequirementPackage;

import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.capella.vp.scenariostories.scenariostories.AbstractStoryComponent;
import org.polarsys.capella.vp.scenariostories.scenariostories.AndEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicElement;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicEvent;
import org.polarsys.capella.vp.scenariostories.scenariostories.BasicGroup;
import org.polarsys.capella.vp.scenariostories.scenariostories.GivenEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioContainer;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenarioStoriesFolder;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesFactory;
import org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage;
import org.polarsys.capella.vp.scenariostories.scenariostories.ThenEdge;
import org.polarsys.capella.vp.scenariostories.scenariostories.WhenEdge;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenariostoriesPackageImpl extends EPackageImpl implements ScenariostoriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioStoriesFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStoryComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass givenEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thenEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEdgeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.capella.vp.scenariostories.scenariostories.ScenariostoriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScenariostoriesPackageImpl() {
		super(eNS_URI, ScenariostoriesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ScenariostoriesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScenariostoriesPackage init() {
		if (isInited)
			return (ScenariostoriesPackage) EPackage.Registry.INSTANCE.getEPackage(ScenariostoriesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScenariostoriesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScenariostoriesPackageImpl theScenariostoriesPackage = registeredScenariostoriesPackage instanceof ScenariostoriesPackageImpl
				? (ScenariostoriesPackageImpl) registeredScenariostoriesPackage
				: new ScenariostoriesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScenariostoriesPackage.createPackageContents();

		// Initialize created meta-data
		theScenariostoriesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScenariostoriesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScenariostoriesPackage.eNS_URI, theScenariostoriesPackage);
		return theScenariostoriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioStoriesFolder() {
		return scenarioStoriesFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioStoriesFolder_OwnedScenarios() {
		return (EReference) scenarioStoriesFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioStoriesFolder_DiagramUIDs() {
		return (EAttribute) scenarioStoriesFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioContainer() {
		return scenarioContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioContainer_OwnedComponents() {
		return (EReference) scenarioContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStoryComponent() {
		return abstractStoryComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicEvent() {
		return basicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicElement() {
		return basicElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicGroup() {
		return basicGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicGroup_OwnedComponents() {
		return (EReference) basicGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicEdge() {
		return basicEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicEdge_SourceComponent() {
		return (EReference) basicEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicEdge_TargetComponent() {
		return (EReference) basicEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhenEdge() {
		return whenEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGivenEdge() {
		return givenEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThenEdge() {
		return thenEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndEdge() {
		return andEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenariostoriesFactory getScenariostoriesFactory() {
		return (ScenariostoriesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		scenarioStoriesFolderEClass = createEClass(SCENARIO_STORIES_FOLDER);
		createEReference(scenarioStoriesFolderEClass, SCENARIO_STORIES_FOLDER__OWNED_SCENARIOS);
		createEAttribute(scenarioStoriesFolderEClass, SCENARIO_STORIES_FOLDER__DIAGRAM_UI_DS);

		scenarioContainerEClass = createEClass(SCENARIO_CONTAINER);
		createEReference(scenarioContainerEClass, SCENARIO_CONTAINER__OWNED_COMPONENTS);

		abstractStoryComponentEClass = createEClass(ABSTRACT_STORY_COMPONENT);

		basicEventEClass = createEClass(BASIC_EVENT);

		basicElementEClass = createEClass(BASIC_ELEMENT);

		basicGroupEClass = createEClass(BASIC_GROUP);
		createEReference(basicGroupEClass, BASIC_GROUP__OWNED_COMPONENTS);

		basicEdgeEClass = createEClass(BASIC_EDGE);
		createEReference(basicEdgeEClass, BASIC_EDGE__SOURCE_COMPONENT);
		createEReference(basicEdgeEClass, BASIC_EDGE__TARGET_COMPONENT);

		whenEdgeEClass = createEClass(WHEN_EDGE);

		givenEdgeEClass = createEClass(GIVEN_EDGE);

		thenEdgeEClass = createEClass(THEN_EDGE);

		andEdgeEClass = createEClass(AND_EDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scenarioStoriesFolderEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		scenarioStoriesFolderEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		scenarioContainerEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		abstractStoryComponentEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		basicEventEClass.getESuperTypes().add(this.getAbstractStoryComponent());
		basicElementEClass.getESuperTypes().add(this.getAbstractStoryComponent());
		basicGroupEClass.getESuperTypes().add(this.getAbstractStoryComponent());
		basicEdgeEClass.getESuperTypes().add(this.getAbstractStoryComponent());
		whenEdgeEClass.getESuperTypes().add(this.getBasicEdge());
		givenEdgeEClass.getESuperTypes().add(this.getBasicEdge());
		thenEdgeEClass.getESuperTypes().add(this.getBasicEdge());
		andEdgeEClass.getESuperTypes().add(this.getBasicEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(scenarioStoriesFolderEClass, ScenarioStoriesFolder.class, "ScenarioStoriesFolder", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioStoriesFolder_OwnedScenarios(), this.getScenarioContainer(), null, "ownedScenarios", //$NON-NLS-1$
				null, 0, -1, ScenarioStoriesFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarioStoriesFolder_DiagramUIDs(), ecorePackage.getEString(), "diagramUIDs", null, 0, -1, //$NON-NLS-1$
				ScenarioStoriesFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioContainerEClass, ScenarioContainer.class, "ScenarioContainer", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioContainer_OwnedComponents(), this.getAbstractStoryComponent(), null,
				"ownedComponents", null, 0, -1, ScenarioContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStoryComponentEClass, AbstractStoryComponent.class, "AbstractStoryComponent", IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicEventEClass, BasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicElementEClass, BasicElement.class, "BasicElement", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicGroupEClass, BasicGroup.class, "BasicGroup", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicGroup_OwnedComponents(), this.getAbstractStoryComponent(), null, "ownedComponents", null, //$NON-NLS-1$
				0, -1, BasicGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEdgeEClass, BasicEdge.class, "BasicEdge", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicEdge_SourceComponent(), this.getAbstractStoryComponent(), null, "sourceComponent", null, //$NON-NLS-1$
				0, 1, BasicEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicEdge_TargetComponent(), this.getAbstractStoryComponent(), null, "targetComponent", null, //$NON-NLS-1$
				0, 1, BasicEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenEdgeEClass, WhenEdge.class, "WhenEdge", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(givenEdgeEClass, GivenEdge.class, "GivenEdge", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(thenEdgeEClass, ThenEdge.class, "ThenEdge", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEdgeEClass, AndEdge.class, "AndEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$
		addAnnotation(scenarioStoriesFolderEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/oa/6.0.0#//OperationalAnalysis" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$
		addAnnotation(scenarioStoriesFolderEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore#//OperationalAnalysis" //$NON-NLS-1$
		});
	}

} //ScenariostoriesPackageImpl
