package typingsSlinky.vegaTooltip

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.vegaTooltip.anon.Height
import typingsSlinky.vegaTooltip.anon.X
import typingsSlinky.vegaTooltip.defaultsMod.Options
import typingsSlinky.vegaTypings.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-tooltip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def calculatePosition(event: MouseEvent, tooltipBox: Height, offsetX: Double, offsetY: Double): X = js.native
  
  def createDefaultStyle(id: String): String = js.native
  
  def default(view: View): typingsSlinky.vegaTooltip.handlerMod.Handler = js.native
  def default(view: View, opt: Options): typingsSlinky.vegaTooltip.handlerMod.Handler = js.native
  
  def escapeHTML(value: js.Any): String = js.native
  
  def formatValue(value: js.Any, valueToHtml: js.Function1[/* value */ js.Any, String], maxDepth: Double): String = js.native
  
  def replacer(maxDepth: Double): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _] = js.native
  
  def stringify(obj: js.Any, maxDepth: Double): String = js.native
  
  val version: String = js.native
  
  @js.native
  object DEFAULT_OPTIONS extends js.Object {
    
    /**
      * Do not use the default styles provided by Vega Tooltip. If you enable this option, you need to use your own styles. It is not necessary to disable the default style when using a custom theme.
      */
    var disableDefaultStyle: Boolean = js.native
    
    /**
      * ID of the tooltip element.
      */
    var id: String = js.native
    
    /**
      * The maximum recursion depth when printing objects in the tooltip.
      */
    var maxDepth: Double = js.native
    
    /**
      * X offset.
      */
    var offsetX: Double = js.native
    
    /**
      * Y offset.
      */
    var offsetY: Double = js.native
    
    /**
      * HTML sanitizer function that removes dangerous HTML to prevent XSS.
      *
      * This should be a function from string to string. You may replace it with a formatter such as a markdown formatter.
      */
    def sanitize(value: js.Any): String = js.native
    /**
      * HTML sanitizer function that removes dangerous HTML to prevent XSS.
      *
      * This should be a function from string to string. You may replace it with a formatter such as a markdown formatter.
      */
    @JSName("sanitize")
    var sanitize_Original: js.Function1[/* value */ js.Any, String] = js.native
    
    /**
      * ID of the tooltip CSS style.
      */
    var styleId: String = js.native
    
    /**
      * The name of the theme. You can use the CSS class called [THEME]-theme to style the tooltips.
      *
      * There are two predefined themes: "light" (default) and "dark".
      */
    var theme: String = js.native
  }
  
  @js.native
  /**
    * Create the tooltip handler and initialize the element and style.
    *
    * @param options Tooltip Options
    */
  class Handler ()
    extends typingsSlinky.vegaTooltip.handlerMod.Handler {
    def this(options: Options) = this()
  }
}
