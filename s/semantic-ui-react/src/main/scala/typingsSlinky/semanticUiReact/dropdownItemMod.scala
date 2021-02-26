package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.flagFlagMod.FlagProps
import typingsSlinky.semanticUiReact.genericMod.HtmlSpanProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownItemMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownItem", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[DropdownItemProps, js.Object, js.Any] {
    def this(props: DropdownItemProps) = this()
    def this(props: DropdownItemProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DropdownItemProps] = js.native
  
  @js.native
  trait DropdownItemProps
    extends StrictDropdownItemProps
       with /* key */ StringDictionary[js.Any]
  object DropdownItemProps {
    
    @scala.inline
    def apply(): DropdownItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownItemProps]
    }
  }
  
  @js.native
  trait StrictDropdownItemProps extends StObject {
    
    /** Style as the currently chosen item. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Additional text with less emphasis. */
    var description: js.UndefOr[SemanticShorthandItem[HtmlSpanProps]] = js.native
    
    /** A dropdown item can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for Flag. */
    var flag: js.UndefOr[SemanticShorthandItem[FlagProps]] = js.native
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
    
    /** Shorthand for Image. */
    var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.native
    
    /** Shorthand for Label. */
    var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.native
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ DropdownItemProps, Unit]
      ] = js.native
    
    /**
      * The item currently selected by keyboard shortcut.
      * This is not the active item.
      */
    var selected: js.UndefOr[Boolean] = js.native
    
    /** Display text. */
    var text: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Stored value. */
    var value: js.UndefOr[Boolean | Double | String] = js.native
  }
  object StrictDropdownItemProps {
    
    @scala.inline
    def apply(): StrictDropdownItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownItemProps]
    }
    
    @scala.inline
    implicit class StrictDropdownItemPropsMutableBuilder[Self <: StrictDropdownItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
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
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: SemanticShorthandItem[HtmlSpanProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ReactElement, HtmlSpanProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFlag(value: SemanticShorthandItem[FlagProps]): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagFunction3(
        value: (/* component */ ReactElement, FlagProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "flag", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFlagReactElement(value: ReactElement): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ReactElement, IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setImage(value: SemanticShorthandItem[ImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFunction3(
        value: (/* component */ ReactElement, ImageProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImageReactElement(value: ReactElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[LabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ReactElement, LabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ DropdownItemProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setText(value: SemanticShorthandContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextReactElement(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DropdownItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownItemMod.foo` */
  override def _to: ReactComponentClass[DropdownItemProps] = default
}
