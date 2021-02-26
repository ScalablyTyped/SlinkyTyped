package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.dimmerDimmableMod.DimmerDimmableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dimmerDimmerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[DimmerProps, js.Object, js.Any] {
    def this(props: DimmerProps) = this()
    def this(props: DimmerProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", JSImport.Default)
    @js.native
    val ^ : DimmerComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", "default.Dimmable")
    @js.native
    class Dimmable protected ()
      extends Component[DimmerDimmableProps, js.Object, js.Any] {
      def this(props: DimmerDimmableProps) = this()
      def this(props: DimmerDimmableProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer", "default.Inner")
    @js.native
    class Inner ()
      extends typingsSlinky.semanticUiReact.dimmerInnerMod.default
    
    type _To = DimmerComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: DimmerComponent = ^
  }
  
  @js.native
  trait DimmerComponent
    extends ComponentClass[DimmerProps, js.Object] {
    
    var Dimmable: ReactComponentClass[DimmerDimmableProps] = js.native
    
    var Inner: Instantiable0[typingsSlinky.semanticUiReact.dimmerInnerMod.default] = js.native
  }
  
  @js.native
  trait DimmerProps
    extends StrictDimmerProps
       with /* key */ StringDictionary[js.Any]
  object DimmerProps {
    
    @scala.inline
    def apply(): DimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DimmerProps]
    }
  }
  
  @js.native
  trait StrictDimmerProps extends StObject {
    
    /** An active dimmer will dim its parent container. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** A dimmer can be formatted to be fixed to the page. */
    var page: js.UndefOr[Boolean] = js.native
  }
  object StrictDimmerProps {
    
    @scala.inline
    def apply(): StrictDimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDimmerProps]
    }
    
    @scala.inline
    implicit class StrictDimmerPropsMutableBuilder[Self <: StrictDimmerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    }
  }
}
