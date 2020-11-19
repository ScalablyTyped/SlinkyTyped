package typingsSlinky.uifabricUtilities

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.std.TypedPropertyDescriptor
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import typingsSlinky.uifabricUtilities.anon.AsyncPlaceholder
import typingsSlinky.uifabricUtilities.anon.Configurable
import typingsSlinky.uifabricUtilities.anon.Delay
import typingsSlinky.uifabricUtilities.anon.Focus
import typingsSlinky.uifabricUtilities.anon.RootRef
import typingsSlinky.uifabricUtilities.anon.Rtl
import typingsSlinky.uifabricUtilities.asAsyncMod.IAsAsyncOptions
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.classNamesFunctionMod.IClassNamesFunctionOptions
import typingsSlinky.uifabricUtilities.cssMod.ICssInput
import typingsSlinky.uifabricUtilities.customizationsMod.ICustomizations
import typingsSlinky.uifabricUtilities.customizationsMod.ISettings
import typingsSlinky.uifabricUtilities.customizationsMod.ISettingsFunction
import typingsSlinky.uifabricUtilities.customizerContextMod.ICustomizerContext
import typingsSlinky.uifabricUtilities.customizerTypesMod.ICustomizerProps
import typingsSlinky.uifabricUtilities.delayedRenderMod.IDelayedRenderProps
import typingsSlinky.uifabricUtilities.fabricPerformanceMod.IPerfSummary
import typingsSlinky.uifabricUtilities.globalSettingsMod.IChangeEventCallback
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.isizeMod.ISize
import typingsSlinky.uifabricUtilities.ivirtualelementMod.IVirtualElement
import typingsSlinky.uifabricUtilities.mathMod.IFitContentToBoundsOptions
import typingsSlinky.uifabricUtilities.pointMod.Point
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import typingsSlinky.uifabricUtilities.styledMod.ICustomizableProps
import typingsSlinky.uifabricUtilities.styledMod.IPropsWithStyles
import typingsSlinky.uifabricUtilities.uifabricUtilitiesBooleans.`false`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`100`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`101`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`102`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`103`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`104`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`105`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`106`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`107`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`109`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`110`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`111`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`112`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`113`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`114`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`115`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`116`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`117`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`118`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`119`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`120`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`121`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`122`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`123`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`13`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`144`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`145`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`16`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`17`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`186`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`187`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`188`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`189`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`18`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`190`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`191`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`192`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`19`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`20`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`219`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`220`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`221`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`222`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`27`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`32`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`33`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`34`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`35`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`36`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`37`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`38`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`39`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`40`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`45`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`46`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`48`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`49`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`50`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`51`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`52`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`53`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`54`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`55`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`56`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`57`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`65`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`66`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`67`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`68`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`69`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`70`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`71`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`72`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`73`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`74`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`75`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`76`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`77`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`78`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`79`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`80`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`81`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`82`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`83`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`84`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`85`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`86`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`87`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`88`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`89`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`8`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`90`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`91`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`92`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`93`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`96`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`97`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`98`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`99`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesNumbers.`9`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesStrings.`data-no-horizontal-wrap`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesStrings.`data-no-vertical-wrap`
import typingsSlinky.uifabricUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typingsSlinky.uifabricUtilities.warnWarnMod.ISettingsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val CustomizerContext: Context[ICustomizerContext] = js.native
  
  val DATA_IS_SCROLLABLE_ATTRIBUTE: /* "data-is-scrollable" */ String = js.native
  
  val DATA_PORTAL_ATTRIBUTE: /* "data-portal-element" */ String = js.native
  
  val FocusRects: ReactComponentClass[RootRef] = js.native
  
  val IsFocusVisibleClassName: /* "ms-Fabric--isFocusVisible" */ String = js.native
  
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  def addDirectionalKeyCode(which: Double): Unit = js.native
  
  def addElementAtIndex[T](array: js.Array[T], index: Double, itemToAdd: T): js.Array[T] = js.native
  
  def allowOverscrollOnElement(element: Null, events: typingsSlinky.uifabricUtilities.eventGroupMod.EventGroup): Unit = js.native
  def allowOverscrollOnElement(element: HTMLElement, events: typingsSlinky.uifabricUtilities.eventGroupMod.EventGroup): Unit = js.native
  
  def allowScrollOnElement(element: Null, events: typingsSlinky.uifabricUtilities.eventGroupMod.EventGroup): Unit = js.native
  def allowScrollOnElement(element: HTMLElement, events: typingsSlinky.uifabricUtilities.eventGroupMod.EventGroup): Unit = js.native
  
  val anchorProperties: Record[String, Double] = js.native
  
  def appendFunction(parent: js.Any, functions: js.Any*): js.Function0[Unit] = js.native
  
  def arraysEqual[T](array1: js.Array[T], array2: js.Array[T]): Boolean = js.native
  
  def asAsync[TProps](options: IAsAsyncOptions[TProps]): ForwardRefExoticComponent[(PropsWithoutRef[TProps with AsyncPlaceholder]) with RefAttributes[ReactElement]] = js.native
  
  def assertNever(x: scala.Nothing): scala.Nothing = js.native
  
  def assign(target: js.Any, args: js.Any*): js.Any = js.native
  
  val audioProperties: Record[String, Double] = js.native
  
  val baseElementEvents: Record[String, Double] = js.native
  
  val baseElementProperties: Record[String, Double] = js.native
  
  val buttonProperties: Record[String, Double] = js.native
  
  def calculatePrecision(value: String): Double = js.native
  def calculatePrecision(value: Double): Double = js.native
  
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](options: IClassNamesFunctionOptions): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
  
  val colGroupProperties: Record[String, Double] = js.native
  
  val colProperties: Record[String, Double] = js.native
  
  def composeComponentAs[TProps](outer: IComponentAs[TProps], inner: IComponentAs[TProps]): IComponentAs[TProps] = js.native
  
  def composeRenderFunction[TProps](outer: IRenderFunction[TProps], inner: IRenderFunction[TProps]): IRenderFunction[TProps] = js.native
  
  def createArray[T](size: Double, getItem: js.Function1[/* index */ Double, T]): js.Array[T] = js.native
  
  def createMemoizer[F /* <: js.Function1[/* input */ js.Any, _] */](getValue: F): F = js.native
  
  def css(args: ICssInput*): String = js.native
  
  def customizable(scope: String, fields: js.Array[String]): js.Function1[/* ComposedComponent */ ReactComponentClass[_], _] = js.native
  def customizable(scope: String, fields: js.Array[String], concatStyles: Boolean): js.Function1[/* ComposedComponent */ ReactComponentClass[_], _] = js.native
  
  def disableBodyScroll(): Unit = js.native
  
  val divProperties: Record[String, Double] = js.native
  
  def doesElementContainFocus(element: HTMLElement): Boolean = js.native
  
  def elementContains(): Boolean = js.native
  def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  
  def elementContainsAttribute(element: HTMLElement, attribute: String): String | Null = js.native
  
  def enableBodyScroll(): Unit = js.native
  
  def extendComponent[T /* <: ReactComponentClass[js.Object] */](
    parent: T,
    methods: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? T[key]}
    */ typingsSlinky.uifabricUtilities.uifabricUtilitiesStrings.extendComponent with TopLevel[T]
  ): Unit = js.native
  
  def filteredAssign(isAllowed: js.Function1[/* propName */ String, Boolean], target: js.Any, args: js.Any*): js.Any = js.native
  
  def find[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  
  def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  def findElementRecursive(element: HTMLElement, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): Double = js.native
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean], fromIndex: Double): Double = js.native
  
  def findScrollableParent(): js.UndefOr[HTMLElement | Window | Null] = js.native
  def findScrollableParent(startingElement: HTMLElement): js.UndefOr[HTMLElement | Window | Null] = js.native
  
  def fitContentToBounds(options: IFitContentToBoundsOptions): ISize = js.native
  
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  
  def focusAsync(): Unit = js.native
  def focusAsync(element: HTMLElement): Unit = js.native
  def focusAsync(element: Focus): Unit = js.native
  
  def focusFirstChild(rootElement: HTMLElement): Boolean = js.native
  
  val formProperties: Record[String, Double] = js.native
  
  def format(s: String, values: js.Any*): String = js.native
  
  def getChildren(parent: HTMLElement): js.Array[HTMLElement] = js.native
  def getChildren(parent: HTMLElement, allowVirtualChildren: Boolean): js.Array[HTMLElement] = js.native
  
  def getDistanceBetweenPoints(point1: Point, point2: Point): Double = js.native
  
  def getDocument(): js.UndefOr[Document] = js.native
  def getDocument(rootElement: HTMLElement): js.UndefOr[Document] = js.native
  
  def getElementIndexPath(fromElement: HTMLElement, toElement: HTMLElement): js.Array[Double] = js.native
  
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: js.UndefOr[scala.Nothing],
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  
  def getFocusableByIndexPath(parent: HTMLElement, path: js.Array[Double]): js.UndefOr[HTMLElement] = js.native
  
  def getId(): String = js.native
  def getId(prefix: String): String = js.native
  
  def getInitials(displayName: js.UndefOr[scala.Nothing], isRtl: Boolean): String = js.native
  def getInitials(displayName: js.UndefOr[scala.Nothing], isRtl: Boolean, allowPhoneInitials: Boolean): String = js.native
  def getInitials(displayName: String, isRtl: Boolean): String = js.native
  def getInitials(displayName: String, isRtl: Boolean, allowPhoneInitials: Boolean): String = js.native
  def getInitials(displayName: Null, isRtl: Boolean): String = js.native
  def getInitials(displayName: Null, isRtl: Boolean, allowPhoneInitials: Boolean): String = js.native
  
  def getLanguage(): String | Null = js.native
  
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: js.UndefOr[scala.Nothing],
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  
  def getNativeElementProps[TAttributes /* <: HTMLAttributes[_] */](
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.Object
  ): TAttributes = js.native
  def getNativeElementProps[TAttributes /* <: HTMLAttributes[_] */](
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.Object,
    excludedPropNames: js.Array[String]
  ): TAttributes = js.native
  
  def getNativeProps[T /* <: Record[String, _] */](props: Record[String, _], allowedPropNames: js.Array[String]): T = js.native
  def getNativeProps[T /* <: Record[String, _] */](props: Record[String, _], allowedPropNames: js.Array[String], excludedPropNames: js.Array[String]): T = js.native
  def getNativeProps[T /* <: Record[String, _] */](props: Record[String, _], allowedPropNames: Record[String, Double]): T = js.native
  def getNativeProps[T /* <: Record[String, _] */](
    props: Record[String, _],
    allowedPropNames: Record[String, Double],
    excludedPropNames: js.Array[String]
  ): T = js.native
  
  def getNextElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  
  def getParent(child: HTMLElement): HTMLElement | Null = js.native
  def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = js.native
  
  def getPreviousElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    traverseChildren: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  
  def getPropsWithDefaults[TProps /* <: js.Object */](defaultProps: Partial[TProps], propsWithoutDefaults: TProps): TProps = js.native
  
  def getRTL(): Boolean = js.native
  def getRTL(theme: Rtl): Boolean = js.native
  
  def getRTLSafeKeyCode(key: Double): Double = js.native
  def getRTLSafeKeyCode(key: Double, theme: Rtl): Double = js.native
  
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window): js.UndefOr[IRectangle] = js.native
  
  def getResourceUrl(url: String): String = js.native
  
  def getScrollbarWidth(): Double = js.native
  
  def getVirtualParent(child: HTMLElement): js.UndefOr[HTMLElement] = js.native
  
  def getWindow(): js.UndefOr[Window] = js.native
  def getWindow(rootElement: Element): js.UndefOr[Window] = js.native
  
  def hasHorizontalOverflow(element: HTMLElement): Boolean = js.native
  
  def hasOverflow(element: HTMLElement): Boolean = js.native
  
  def hasVerticalOverflow(element: HTMLElement): Boolean = js.native
  
  def hoistMethods(destination: js.Any, source: js.Any): js.Array[String] = js.native
  def hoistMethods(destination: js.Any, source: js.Any, exclusions: js.Array[String]): js.Array[String] = js.native
  
  def hoistStatics[TSource /* <: js.Object */, TDest](source: TSource, dest: TDest): TDest = js.native
  
  val htmlElementProperties: Record[String, Double] = js.native
  
  val iframeProperties: Record[String, Double] = js.native
  
  val imageProperties: Record[String, Double] = js.native
  
  val imgProperties: Record[String, Double] = js.native
  
  def initializeComponentRef[TProps /* <: IBaseProps[_] */, TState](obj: ReactComponentClass[TProps]): Unit = js.native
  
  def initializeFocusRects(): Unit = js.native
  def initializeFocusRects(window: Window): Unit = js.native
  
  val inputProperties: Record[String, Double] = js.native
  
  def isControlled[P](props: P, valueProp: /* keyof P */ String): Boolean = js.native
  
  def isDirectionalKeyCode(which: Double): Boolean = js.native
  
  def isElementFocusSubZone(): Boolean = js.native
  def isElementFocusSubZone(element: HTMLElement): Boolean = js.native
  
  def isElementFocusZone(): Boolean = js.native
  def isElementFocusZone(element: HTMLElement): Boolean = js.native
  
  def isElementTabbable(element: HTMLElement): Boolean = js.native
  def isElementTabbable(element: HTMLElement, checkTabIndex: Boolean): Boolean = js.native
  
  def isElementVisible(): Boolean = js.native
  def isElementVisible(element: HTMLElement): Boolean = js.native
  
  def isIE11(): Boolean = js.native
  
  def isIOS(): Boolean = js.native
  
  def isMac(): Boolean = js.native
  def isMac(reset: Boolean): Boolean = js.native
  
  def isVirtualElement(element: HTMLElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  def isVirtualElement(element: IVirtualElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  
  val labelProperties: Record[String, Double] = js.native
  
  val liProperties: Record[String, Double] = js.native
  
  def mapEnumByName[T](
    theEnum: js.Any,
    callback: js.Function2[
      /* name */ js.UndefOr[String], 
      /* value */ js.UndefOr[String | Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = js.native
  
  def memoize[T /* <: js.Function */](target: js.Any, key: String, descriptor: TypedPropertyDescriptor[T]): Configurable[T] = js.native
  
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: js.UndefOr[scala.Nothing], ignoreNullOrUndefinedResult: Boolean): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: Double): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RetType] */, RetType](cb: T, maxCacheSize: Double, ignoreNullOrUndefinedResult: Boolean): T = js.native
  
  @JSName("mergeAriaAttributeValues")
  def mergeAriaAttributeValues_false(ariaAttributes: (js.UndefOr[String | `false`])*): js.UndefOr[String] = js.native
  
  def mergeCustomizations(props: ICustomizerProps, parentContext: ICustomizerContext): ICustomizerContext = js.native
  
  def mergeScopedSettings(): ISettings = js.native
  def mergeScopedSettings(oldSettings: js.UndefOr[scala.Nothing], newSettings: ISettings): ISettings = js.native
  def mergeScopedSettings(oldSettings: js.UndefOr[scala.Nothing], newSettings: ISettingsFunction): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings, newSettings: ISettings): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings, newSettings: ISettingsFunction): ISettings = js.native
  
  def mergeSettings(): ISettings = js.native
  def mergeSettings(oldSettings: js.UndefOr[scala.Nothing], newSettings: ISettings): ISettings = js.native
  def mergeSettings(oldSettings: js.UndefOr[scala.Nothing], newSettings: ISettingsFunction): ISettings = js.native
  def mergeSettings(oldSettings: ISettings): ISettings = js.native
  def mergeSettings(oldSettings: ISettings, newSettings: ISettings): ISettings = js.native
  def mergeSettings(oldSettings: ISettings, newSettings: ISettingsFunction): ISettings = js.native
  
  @JSName("merge")
  def merge_false[T](target: Partial[T], args: (js.UndefOr[Partial[T] | Null | `false`])*): T = js.native
  
  def modalize(target: HTMLElement): js.Function0[Unit] = js.native
  
  def nullRender(): ReactElement | Null = js.native
  
  val olProperties: Record[String, Double] = js.native
  
  def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = js.native
  
  val optionProperties: Record[String, Double] = js.native
  
  def portalContainsElement(target: HTMLElement): Boolean = js.native
  def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = js.native
  
  def precisionRound(value: Double, precision: Double): Double = js.native
  def precisionRound(value: Double, precision: Double, base: Double): Double = js.native
  
  def raiseClick(target: Element): Unit = js.native
  
  def removeIndex[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  def replaceElement[T](array: js.Array[T], newElement: T, index: Double): js.Array[T] = js.native
  
  def resetControlledWarnings(): Unit = js.native
  
  def resetIds(): Unit = js.native
  def resetIds(counter: Double): Unit = js.native
  
  def resetMemoizations(): Unit = js.native
  
  def safeRequestAnimationFrame(component: ReactComponentClass[js.Object]): js.Function1[/* cb */ js.Function, Unit] = js.native
  
  def safeSetTimeout(component: ReactComponentClass[js.Object]): js.Function2[/* cb */ js.Function, /* duration */ Double, Unit] = js.native
  
  val selectProperties: Record[String, Double] = js.native
  
  def setBaseUrl(baseUrl: String): Unit = js.native
  
  def setFocusVisibility(enabled: Boolean): Unit = js.native
  def setFocusVisibility(enabled: Boolean, target: Element): Unit = js.native
  
  def setLanguage(language: String): Unit = js.native
  def setLanguage(language: String, avoidPersisting: Boolean): Unit = js.native
  
  def setMemoizeWeakMap(weakMap: js.Any): Unit = js.native
  
  def setPortalAttribute(element: HTMLElement): Unit = js.native
  
  def setRTL(isRTL: Boolean): Unit = js.native
  def setRTL(isRTL: Boolean, persistSetting: Boolean): Unit = js.native
  
  def setSSR(isEnabled: Boolean): Unit = js.native
  
  def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = js.native
  
  def setWarningCallback(): Unit = js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  def shallowCompare[TA /* <: js.Any */, TB /* <: js.Any */](a: TA, b: TB): Boolean = js.native
  
  @JSName("shouldWrapFocus")
  def shouldWrapFocus_datanohorizontalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-horizontal-wrap`): Boolean = js.native
  @JSName("shouldWrapFocus")
  def shouldWrapFocus_datanoverticalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-vertical-wrap`): Boolean = js.native
  
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("styled")
  def styled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  
  val tableProperties: Record[String, Double] = js.native
  
  val tdProperties: Record[String, Double] = js.native
  
  val textAreaProperties: Record[String, Double] = js.native
  
  val thProperties: Record[String, Double] = js.native
  
  def toMatrix[T](items: js.Array[T], columnCount: Double): js.Array[js.Array[T]] = js.native
  
  val trProperties: Record[String, Double] = js.native
  
  def unhoistMethods(source: js.Any, methodNames: js.Array[String]): Unit = js.native
  
  def useCustomizationSettings(properties: js.Array[String]): ISettings = js.native
  def useCustomizationSettings(properties: js.Array[String], scopeName: String): ISettings = js.native
  
  def useFocusRects(): Unit = js.native
  def useFocusRects(rootRef: ReactRef[HTMLElement]): Unit = js.native
  
  def values[T](obj: js.Any): js.Array[T] = js.native
  
  val videoProperties: Record[String, Double] = js.native
  
  def warn(message: String): Unit = js.native
  
  def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = js.native
  
  def warnControlledUsage[P](params: IWarnControlledUsageParams[P]): Unit = js.native
  
  def warnDeprecations[P](componentName: String, props: P, deprecationMap: ISettingsMap[P]): Unit = js.native
  
  def warnMutuallyExclusive[P](componentName: String, props: P, exclusiveMap: ISettingsMap[P]): Unit = js.native
  
  @js.native
  class Async ()
    extends typingsSlinky.uifabricUtilities.asyncMod.Async {
    def this(parent: js.Object) = this()
    def this(parent: js.UndefOr[scala.Nothing], onError: js.Function1[/* e */ js.Any, Unit]) = this()
    def this(parent: js.Object, onError: js.Function1[/* e */ js.Any, Unit]) = this()
  }
  
  @js.native
  class AutoScroll protected ()
    extends typingsSlinky.uifabricUtilities.autoScrollMod.AutoScroll {
    def this(element: HTMLElement) = this()
  }
  
  @js.native
  class BaseComponent[TProps /* <: IBaseProps[_] */, TState] protected ()
    extends typingsSlinky.uifabricUtilities.baseComponentMod.BaseComponent[TProps, TState] {
    /**
      * BaseComponent constructor
      * @param props - The props for the component.
      * @param context - The context for the component.
      */
    def this(props: TProps) = this()
    def this(props: TProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object BaseComponent extends js.Object {
    
    /**
      * @deprecated Use React's error boundaries instead.
      */
    def onError(): Unit = js.native
    def onError(errorMessage: js.UndefOr[scala.Nothing], ex: js.Any): Unit = js.native
    def onError(errorMessage: String): Unit = js.native
    def onError(errorMessage: String, ex: js.Any): Unit = js.native
  }
  
  @js.native
  class Customizations ()
    extends typingsSlinky.uifabricUtilities.customizationsMod.Customizations
  /* static members */
  @js.native
  object Customizations extends js.Object {
    
    var _raiseChange: js.Any = js.native
    
    var _suppressUpdates: js.Any = js.native
    
    /** Used to run some code that sets Customizations without triggering an update until the end.
      * Useful for applying Customizations that don't affect anything currently rendered, or for
      * applying many customizations at once.
      * @param suppressUpdate - Do not raise the change event at the end, preventing all updates
      */
    def applyBatchedUpdates(code: js.Function0[Unit]): Unit = js.native
    def applyBatchedUpdates(code: js.Function0[Unit], suppressUpdate: Boolean): Unit = js.native
    
    /** Apply Customizations to a particular named scope, like a component.
      * @example Customizations.applyScopedSettings('Nav', \{ styles: () =\> \{\} \});
      */
    def applyScopedSettings(scopeName: String, settings: ISettings): Unit = js.native
    
    /** Apply global Customization settings.
      * @example Customizations.applySettings(\{ theme: \{...\} \});
      */
    def applySettings(settings: ISettings): Unit = js.native
    
    def getSettings(properties: js.Array[String]): js.Any = js.native
    def getSettings(properties: js.Array[String], scopeName: js.UndefOr[scala.Nothing], localSettings: ICustomizations): js.Any = js.native
    def getSettings(properties: js.Array[String], scopeName: String): js.Any = js.native
    def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): js.Any = js.native
    
    def observe(onChange: js.Function0[Unit]): Unit = js.native
    
    def reset(): Unit = js.native
    
    def unobserve(onChange: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  class Customizer ()
    extends typingsSlinky.uifabricUtilities.customizerMod.Customizer
  
  @js.native
  class DelayedRender protected ()
    extends typingsSlinky.uifabricUtilities.delayedRenderMod.DelayedRender {
    def this(props: IDelayedRenderProps) = this()
  }
  /* static members */
  @js.native
  object DelayedRender extends js.Object {
    
    var defaultProps: Delay = js.native
  }
  
  @js.native
  class EventGroup protected ()
    extends typingsSlinky.uifabricUtilities.eventGroupMod.EventGroup {
    /** parent: the context in which events attached to non-HTMLElements are called */
    def this(parent: js.Any) = this()
  }
  /* static members */
  @js.native
  object EventGroup extends js.Object {
    
    var _isElement: js.Any = js.native
    
    var _uniqueId: js.Any = js.native
    
    /** Check to see if the target has declared support of the given event. */
    def isDeclared(target: js.Any, eventName: String): Boolean = js.native
    
    def isObserved(target: js.Any, eventName: String): Boolean = js.native
    
    /** For IE8, bubbleEvent is ignored here and must be dealt with by the handler.
      *  Events raised here by default have bubbling set to false and cancelable set to true.
      *  This applies also to built-in events being raised manually here on HTMLElements,
      *  which may lead to unexpected behavior if it differs from the defaults.
      *
      */
    def raise(target: js.Any, eventName: String): js.UndefOr[Boolean] = js.native
    def raise(target: js.Any, eventName: String, eventArgs: js.UndefOr[scala.Nothing], bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
    def raise(target: js.Any, eventName: String, eventArgs: js.Any): js.UndefOr[Boolean] = js.native
    def raise(target: js.Any, eventName: String, eventArgs: js.Any, bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
    
    def stopPropagation(event: js.Any): Unit = js.native
  }
  
  @js.native
  class FabricPerformance ()
    extends typingsSlinky.uifabricUtilities.fabricPerformanceMod.FabricPerformance
  /* static members */
  @js.native
  object FabricPerformance extends js.Object {
    
    var _timeoutId: js.Any = js.native
    
    /**
      * Measures execution time of the given syncronous function. If the same logic is executed multiple times,
      * each individual measurement will be collected as well the overall numbers.
      * @param name - The name of this measurement
      * @param func - The logic to be measured for execution time
      */
    def measure(name: String, func: js.Function0[Unit]): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setPeriodicReset(): Unit = js.native
    
    var summary: IPerfSummary = js.native
  }
  
  @js.native
  class GlobalSettings ()
    extends typingsSlinky.uifabricUtilities.globalSettingsMod.GlobalSettings
  /* static members */
  @js.native
  object GlobalSettings extends js.Object {
    
    def addChangeListener(cb: IChangeEventCallback): Unit = js.native
    
    def getValue[T](key: String): T = js.native
    def getValue[T](key: String, defaultValue: T): T = js.native
    def getValue[T](key: String, defaultValue: js.Function0[T]): T = js.native
    
    def removeChangeListener(cb: IChangeEventCallback): Unit = js.native
    
    def setValue[T](key: String, value: T): T = js.native
  }
  
  @js.native
  object KeyCodes extends js.Object {
    
    var a: `65` = js.native
    
    var add: `107` = js.native
    
    var alt: `18` = js.native
    
    var b: `66` = js.native
    
    var backSlash: `220` = js.native
    
    var backspace: `8` = js.native
    
    var c: `67` = js.native
    
    var capslock: `20` = js.native
    
    var closeBracket: `221` = js.native
    
    var comma: `188` = js.native
    
    var ctrl: `17` = js.native
    
    var d: `68` = js.native
    
    var dash: `189` = js.native
    
    var decimalPoint: `110` = js.native
    
    var del: `46` = js.native
    
    var divide: `111` = js.native
    
    var down: `40` = js.native
    
    var e: `69` = js.native
    
    var eight: `56` = js.native
    
    var eight_numpad: `104` = js.native
    
    var end: `35` = js.native
    
    var enter: `13` = js.native
    
    var equalSign: `187` = js.native
    
    var escape: `27` = js.native
    
    var f: `70` = js.native
    
    var f1: `112` = js.native
    
    var f10: `121` = js.native
    
    var f11: `122` = js.native
    
    var f12: `123` = js.native
    
    var f2: `113` = js.native
    
    var f3: `114` = js.native
    
    var f4: `115` = js.native
    
    var f5: `116` = js.native
    
    var f6: `117` = js.native
    
    var f7: `118` = js.native
    
    var f8: `119` = js.native
    
    var f9: `120` = js.native
    
    var five: `53` = js.native
    
    var five_numpad: `101` = js.native
    
    var forwardSlash: `191` = js.native
    
    var four: `52` = js.native
    
    var four_numpad: `100` = js.native
    
    var g: `71` = js.native
    
    var graveAccent: `192` = js.native
    
    var h: `72` = js.native
    
    var home: `36` = js.native
    
    var i: `73` = js.native
    
    var insert: `45` = js.native
    
    var j: `74` = js.native
    
    var k: `75` = js.native
    
    var l: `76` = js.native
    
    var left: `37` = js.native
    
    var leftWindow: `91` = js.native
    
    var m: `77` = js.native
    
    var multiply: `106` = js.native
    
    var n: `78` = js.native
    
    var nine: `57` = js.native
    
    var nine_numpad: `105` = js.native
    
    var numlock: `144` = js.native
    
    var o: `79` = js.native
    
    var one: `49` = js.native
    
    var one_numpad: `97` = js.native
    
    var openBracket: `219` = js.native
    
    var p: `80` = js.native
    
    var pageDown: `34` = js.native
    
    var pageUp: `33` = js.native
    
    var pauseBreak: `19` = js.native
    
    var period: `190` = js.native
    
    var q: `81` = js.native
    
    var r: `82` = js.native
    
    var right: `39` = js.native
    
    var rightWindow: `92` = js.native
    
    var s: `83` = js.native
    
    var scrollLock: `145` = js.native
    
    var select: `93` = js.native
    
    var semicolon: `186` = js.native
    
    var seven: `55` = js.native
    
    var seven_numpad: `103` = js.native
    
    var shift: `16` = js.native
    
    var singleQuote: `222` = js.native
    
    var six: `54` = js.native
    
    var six_numpad: `102` = js.native
    
    var space: `32` = js.native
    
    var subtract: `109` = js.native
    
    var t: `84` = js.native
    
    var tab: `9` = js.native
    
    var three: `51` = js.native
    
    var three_numpad: `99` = js.native
    
    var two: `50` = js.native
    
    var two_numpad: `98` = js.native
    
    var u: `85` = js.native
    
    var up: `38` = js.native
    
    var v: `86` = js.native
    
    var w: `87` = js.native
    
    var x: `88` = js.native
    
    var y: `89` = js.native
    
    var z: `90` = js.native
    
    var zero: `48` = js.native
    
    var zero_numpad: `96` = js.native
  }
  
  @js.native
  class Rectangle ()
    extends typingsSlinky.uifabricUtilities.rectangleMod.Rectangle {
    def this(left: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double) = this()
    def this(left: Double, right: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], top: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double, top: Double) = this()
    def this(left: Double, right: js.UndefOr[scala.Nothing], top: Double) = this()
    def this(left: Double, right: Double, top: Double) = this()
    def this(
      left: js.UndefOr[scala.Nothing],
      right: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      bottom: Double
    ) = this()
    def this(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], top: Double, bottom: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double, top: js.UndefOr[scala.Nothing], bottom: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double, top: Double, bottom: Double) = this()
    def this(left: Double, right: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], bottom: Double) = this()
    def this(left: Double, right: js.UndefOr[scala.Nothing], top: Double, bottom: Double) = this()
    def this(left: Double, right: Double, top: js.UndefOr[scala.Nothing], bottom: Double) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  }
  
  @js.native
  class Selection[TItem] protected ()
    extends typingsSlinky.uifabricUtilities.selectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @js.native
  object SelectionDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
    
    /* 0 */ val horizontal: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
    
    /* 2 */ val multiple: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    /* 0 */ val none: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    /* 1 */ val single: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
  }
}
