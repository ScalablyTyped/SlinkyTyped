package typingsSlinky.wordpressElement

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.Text
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.anon.Default
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.DependencyList
import typingsSlinky.react.mod.DetailedReactHTMLElement
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.DispatchWithoutAction
import typingsSlinky.react.mod.EffectCallback
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.ForwardRefRenderFunction
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.FunctionComponentElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ReactChildren
import typingsSlinky.react.mod.ReactHTMLElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.ReactPortal
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.react.mod.Reducer
import typingsSlinky.react.mod.ReducerAction
import typingsSlinky.react.mod.ReducerState
import typingsSlinky.react.mod.ReducerStateWithoutAction
import typingsSlinky.react.mod.ReducerWithoutAction
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.react.mod.SetStateAction
import typingsSlinky.react.mod.SuspenseProps
import typingsSlinky.reactDom.mod.Renderer
import typingsSlinky.std.Partial
import typingsSlinky.wordpressElement.anon.childrenstringPickDetaile
import typingsSlinky.wordpressElement.wordpressElementStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/element", "Children")
  @js.native
  val Children: ReactChildren = js.native
  
  // Base component for plain JS classes
  @JSImport("@wordpress/element", "Component")
  @js.native
  class Component[P, S, SS] protected ()
    extends typingsSlinky.wordpressElement.reactMod.Component[P, S, SS] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  object Component {
    
    @JSImport("@wordpress/element", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    /* static member */
    @JSImport("@wordpress/element", "Component.contextType")
    @js.native
    def contextType: js.UndefOr[Context[js.Any]] = js.native
    @scala.inline
    def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/element", "Fragment")
  @js.native
  val Fragment: ReactComponentClass[typingsSlinky.react.anon.Children] = js.native
  
  object Platform {
    
    @JSImport("@wordpress/element", "Platform.OS")
    @js.native
    val OS: String = js.native
    
    @JSImport("@wordpress/element", "Platform.select")
    @js.native
    def select(spec: js.Any): js.Any = js.native
  }
  
  @JSImport("@wordpress/element", "RawHTML")
  @js.native
  def RawHTML(hasChildrenProps: childrenstringPickDetaile): ReactElement = js.native
  
  @JSImport("@wordpress/element", "StrictMode")
  @js.native
  val StrictMode: ReactComponentClass[typingsSlinky.react.anon.Children] = js.native
  
  /**
    * This feature is not yet available for server-side rendering.
    * Suspense support will be added in a later release.
    */
  @JSImport("@wordpress/element", "Suspense")
  @js.native
  val Suspense: ReactComponentClass[SuspenseProps] = js.native
  
  // Custom components
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactElement*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](element: FunctionComponentElement[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](
    element: typingsSlinky.react.mod.ReactElement,
    props: Partial[P] with Attributes,
    children: ReactElement*
  ): ReactElement = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P](
    element: typingsSlinky.react.mod.ReactElement,
    props: js.UndefOr[scala.Nothing],
    children: ReactElement*
  ): ReactElement = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactElement*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
  // DOM Elements
  // ReactHTMLElement
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactElement*): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactElement*): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactSVGElement = js.native
  // ReactHTMLElement, less specific
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactElement*): ReactHTMLElement[T] = js.native
  @JSImport("@wordpress/element", "cloneElement")
  @js.native
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactHTMLElement[T] = js.native
  
  @JSImport("@wordpress/element", "concatChildren")
  @js.native
  def concatChildren(childrenArguments: js.Any*): js.Array[_] = js.native
  
  @JSImport("@wordpress/element", "createContext")
  @js.native
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): Context[T] = js.native
  
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
    props: ClassAttributes[ReactComponentClass[P]] with P,
    children: ReactElement*
  ): CElement[P, ReactComponentClass[P]] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
    props: js.UndefOr[scala.Nothing],
    children: ReactElement*
  ): CElement[P, ReactComponentClass[P]] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
    props: Null,
    children: ReactElement*
  ): CElement[P, ReactComponentClass[P]] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: Attributes with P, children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: Null, children: ReactElement*): ReactElement = js.native
  // Custom components
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactElement*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactElement*): FunctionComponentElement[P] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactElement*
  ): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactElement*
  ): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactElement*
  ): ReactSVGElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactElement*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactElement*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: Null, children: ReactElement*): CElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactElement*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactElement*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactElement*
  ): DetailedReactHTMLElement[P, T] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Attributes with P, children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Null, children: ReactElement*): ReactElement = js.native
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_input(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: ReactElement*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_input(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSImport("@wordpress/element", "createElement")
  @js.native
  def createElement_input(`type`: input, props: Null, children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  
  @JSImport("@wordpress/element", "createInterpolateElement")
  @js.native
  def createInterpolateElement(interpolatedString: String, conversionMap: js.Any): ReactElement = js.native
  
  @JSImport("@wordpress/element", "createPortal")
  @js.native
  def createPortal(children: ReactElement, container: Element): ReactPortal = js.native
  @JSImport("@wordpress/element", "createPortal")
  @js.native
  def createPortal(children: ReactElement, container: Element, key: String): ReactPortal = js.native
  
  @JSImport("@wordpress/element", "createRef")
  @js.native
  def createRef[T](): ReactRef[T] = js.native
  
  @JSImport("@wordpress/element", "findDOMNode")
  @js.native
  def findDOMNode(): Element | Null | Text = js.native
  @JSImport("@wordpress/element", "findDOMNode")
  @js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  
  @JSImport("@wordpress/element", "forwardRef")
  @js.native
  def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]] = js.native
  
  @JSImport("@wordpress/element", "isEmptyElement")
  @js.native
  def isEmptyElement(element: js.Any): Boolean = js.native
  
  @JSImport("@wordpress/element", "isValidElement")
  @js.native
  def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
  @JSImport("@wordpress/element", "isValidElement")
  @js.native
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[T /* <: ReactComponentClass[_] */](Component: T): ReactComponentClass[T] = js.native
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[T /* <: ReactComponentClass[_] */](
    Component: T,
    propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
  ): ReactComponentClass[T] = js.native
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[P /* <: js.Object */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  @JSImport("@wordpress/element", "memo")
  @js.native
  def memo[P /* <: js.Object */](
    Component: ReactComponentClass[P],
    propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
  ): ReactComponentClass[P] = js.native
  
  @JSImport("@wordpress/element", "render")
  @js.native
  val render: Renderer = js.native
  
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactElement): String = js.native
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactElement, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactElement, context: js.Any): String = js.native
  @JSImport("@wordpress/element", "renderToString")
  @js.native
  def renderToString(element: ReactElement, context: js.Any, legacyContext: js.Any): String = js.native
  
  @JSImport("@wordpress/element", "switchChildrenNodeName")
  @js.native
  def switchChildrenNodeName(children: js.Any, nodeName: String): js.Any = js.native
  
  @JSImport("@wordpress/element", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  @JSImport("@wordpress/element", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
  
  // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
  // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
  /**
    * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
    * has changed.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecallback
    */
  // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
  @JSImport("@wordpress/element", "useCallback")
  @js.native
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: DependencyList): T = js.native
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  @JSImport("@wordpress/element", "useContext")
  @js.native
  def useContext[T](context: Context[T]): T = js.native
  
  /**
    * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
    *
    * NOTE: We don’t recommend adding debug values to every custom hook.
    * It’s most valuable for custom hooks that are part of shared libraries.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
    */
  // the name of the custom hook is itself derived from the function name at runtime:
  // it's just the function name without the "use" prefix.
  @JSImport("@wordpress/element", "useDebugValue")
  @js.native
  def useDebugValue[T](value: T): Unit = js.native
  @JSImport("@wordpress/element", "useDebugValue")
  @js.native
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): Unit = js.native
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  @JSImport("@wordpress/element", "useEffect")
  @js.native
  def useEffect(effect: EffectCallback): Unit = js.native
  @JSImport("@wordpress/element", "useEffect")
  @js.native
  def useEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
  
  // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
  /**
    * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
    * `ref`. As always, imperative code using refs should be avoided in most cases.
    *
    * `useImperativeHandle` should be used with `React.forwardRef`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
    */
  @JSImport("@wordpress/element", "useImperativeHandle")
  @js.native
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R]): Unit = js.native
  @JSImport("@wordpress/element", "useImperativeHandle")
  @js.native
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R], deps: DependencyList): Unit = js.native
  
  /**
    * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
    * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
    * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
    *
    * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
    *
    * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
    * `componentDidMount` and `componentDidUpdate`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
    */
  @JSImport("@wordpress/element", "useLayoutEffect")
  @js.native
  def useLayoutEffect(effect: EffectCallback): Unit = js.native
  @JSImport("@wordpress/element", "useLayoutEffect")
  @js.native
  def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
  
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
    * the second argument.
    *
    * ```ts
    * function expensive () { ... }
    *
    * function Component () {
    *   const expensiveResult = useMemo(expensive, [expensive])
    *   return ...
    * }
    * ```
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usememo
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  @JSImport("@wordpress/element", "useMemo")
  @js.native
  def useMemo[T](factory: js.Function0[T]): T = js.native
  @JSImport("@wordpress/element", "useMemo")
  @js.native
  def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = js.native
  
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload where dispatch could accept 0 arguments.
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer[R /* <: ReducerWithoutAction[_] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload where dispatch could accept 0 arguments.
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer[R /* <: ReducerWithoutAction[_] */, I](
    reducer: R,
    initializerArg: I,
    initializer: js.Function1[/* arg */ I, ReducerStateWithoutAction[R]]
  ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
  // The Flow types do have an overload for 3-ary invocation with undefined initializer.
  // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
  // supertype between the reducer's return type and the initialState (or the initializer's return type),
  // which would prevent autocompletion from ever working.
  // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
  // in older versions, or a regression in newer versions of the typescript completion service.
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer_R_ReducerWildcardWildcard[R /* <: Reducer[_, _] */](reducer: R, initialState: ReducerState[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  @JSImport("@wordpress/element", "useReducer")
  @js.native
  def useReducer_R_ReducerWildcardWildcardI[R /* <: Reducer[_, _] */, I](
    reducer: R,
    initializerArg: (I with ReducerState[R]) | I,
    initializer: js.Function1[(/* arg */ I with ReducerState[R]) | (/* arg */ I), ReducerState[R]]
  ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
  
  // convenience overload for potentially undefined initialValue / call with 0 arguments
  // has a default to stop it from defaulting to {} instead
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef[T](): MutableRefObject[js.UndefOr[T]] = js.native
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef[T](initialValue: T): MutableRefObject[T] = js.native
  // convenience overload for refs given as a ref prop as they typically start with a null value
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
    * of the generic argument.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef_T_RefObject[T](): ReactRef[T] = js.native
  @JSImport("@wordpress/element", "useRef")
  @js.native
  def useRef_T_RefObject[T](initialValue: T): ReactRef[T] = js.native
  
  // convenience overload when first argument is omitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @JSImport("@wordpress/element", "useState")
  @js.native
  def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @JSImport("@wordpress/element", "useState")
  @js.native
  def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  @JSImport("@wordpress/element", "useState")
  @js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  
  @JSImport("@wordpress/element", "lazy")
  @js.native
  def `lazy`[T /* <: ReactComponentClass[_] */](factory: js.Function0[js.Promise[Default[T]]]): ReactComponentClass[T] = js.native
}
