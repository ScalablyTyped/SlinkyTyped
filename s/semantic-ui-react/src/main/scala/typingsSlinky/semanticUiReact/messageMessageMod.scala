package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.messageContentMod.MessageContentProps
import typingsSlinky.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typingsSlinky.semanticUiReact.messageItemMod.MessageItemProps
import typingsSlinky.semanticUiReact.messageListMod.MessageListProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMessageMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[MessageProps, js.Object, js.Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  val default: MessageComponent = js.native
  
  @js.native
  trait MessageComponent
    extends ComponentClass[MessageProps, js.Object] {
    
    var Content: ReactComponentClass[MessageContentProps] = js.native
    
    var Header: ReactComponentClass[MessageHeaderProps] = js.native
    
    var Item: ReactComponentClass[MessageItemProps] = js.native
    
    var List: ReactComponentClass[MessageListProps] = js.native
  }
  
  @js.native
  trait MessageProps
    extends StrictMessageProps
       with /* key */ StringDictionary[js.Any]
  object MessageProps {
    
    @scala.inline
    def apply(): MessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.small
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.large
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.big
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
  */
  trait MessageSizeProp extends StObject
  object MessageSizeProp {
    
    @scala.inline
    def big: typingsSlinky.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.big]
    
    @scala.inline
    def huge: typingsSlinky.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.huge]
    
    @scala.inline
    def large: typingsSlinky.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.large]
    
    @scala.inline
    def massive: typingsSlinky.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.massive]
    
    @scala.inline
    def mini: typingsSlinky.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.mini]
    
    @scala.inline
    def small: typingsSlinky.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.small]
    
    @scala.inline
    def tiny: typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  @js.native
  trait StrictMessageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A message can be formatted to attach itself to other content. */
    var attached: js.UndefOr[Boolean | bottom | top] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A message can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** A message can only take up the width of its content. */
    var compact: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A message may be formatted to display a negative message. Same as `negative`. */
    var error: js.UndefOr[Boolean] = js.native
    
    /** A message can float above content that it is related to. */
    var floating: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for MessageHeader. */
    var header: js.UndefOr[SemanticShorthandItem[MessageHeaderProps]] = js.native
    
    /** A message can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /** Add an icon by icon name or pass an <Icon /.> */
    var icon: js.UndefOr[js.Any | Boolean] = js.native
    
    /** A message may be formatted to display information. */
    var info: js.UndefOr[Boolean] = js.native
    
    /** Array shorthand items for the MessageList. Mutually exclusive with children. */
    var list: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.native
    
    /** A message may be formatted to display a negative message. Same as `error`. */
    var negative: js.UndefOr[Boolean] = js.native
    
    /**
      * A message that the user can choose to hide.
      * Called when the user clicks the "x" icon. This also adds the "x" icon.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onDismiss: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ MessageProps, Unit]
      ] = js.native
    
    /** A message may be formatted to display a positive message.  Same as `success`. */
    var positive: js.UndefOr[Boolean] = js.native
    
    /** A message can have different sizes. */
    var size: js.UndefOr[MessageSizeProp] = js.native
    
    /** A message may be formatted to display a positive message.  Same as `positive`. */
    var success: js.UndefOr[Boolean] = js.native
    
    /** A message can be set to visible to force itself to be shown. */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** A message may be formatted to display warning messages. */
    var warning: js.UndefOr[Boolean] = js.native
  }
  object StrictMessageProps {
    
    @scala.inline
    def apply(): StrictMessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageProps]
    }
    
    @scala.inline
    implicit class StrictMessagePropsMutableBuilder[Self <: StrictMessageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | bottom | top): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[MessageHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ReactElement, MessageHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any | Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setList(value: SemanticShorthandCollection[MessageItemProps]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: SemanticShorthandItem[MessageItemProps]*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ MessageProps) => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setSize(value: MessageSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type _To = MessageComponent
  
  /* This means you don't have to write `default`, but can instead just say `messageMessageMod.foo` */
  override def _to: MessageComponent = default
}
