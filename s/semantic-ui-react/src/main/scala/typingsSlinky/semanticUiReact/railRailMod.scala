package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object railRailMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Rail/Rail", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RailProps] = js.native
  
  @js.native
  trait RailProps
    extends StrictRailProps
       with /* key */ StringDictionary[js.Any]
  object RailProps {
    
    @scala.inline
    def apply(position: SemanticFLOATS): RailProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[RailProps]
    }
  }
  
  @js.native
  trait StrictRailProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A rail can appear attached to the main viewport. */
    var attached: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A rail can appear closer to the main viewport. */
    var close: js.UndefOr[Boolean | very] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A rail can create a division between itself and a container. */
    var dividing: js.UndefOr[Boolean] = js.native
    
    /** A rail can attach itself to the inside of a container. */
    var internal: js.UndefOr[Boolean] = js.native
    
    /** A rail can be presented on the left or right side of a container. */
    var position: SemanticFLOATS = js.native
    
    /** A rail can have different sizes. */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
  }
  object StrictRailProps {
    
    @scala.inline
    def apply(position: SemanticFLOATS): StrictRailProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictRailProps]
    }
    
    @scala.inline
    implicit class StrictRailPropsMutableBuilder[Self <: StrictRailProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
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
      def setClose(value: Boolean | very): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDividing(value: Boolean): Self = StObject.set(x, "dividing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividingUndefined: Self = StObject.set(x, "dividing", js.undefined)
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      @scala.inline
      def setPosition(value: SemanticFLOATS): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RailProps]
  
  /* This means you don't have to write `default`, but can instead just say `railRailMod.foo` */
  override def _to: ReactComponentClass[RailProps] = default
}
