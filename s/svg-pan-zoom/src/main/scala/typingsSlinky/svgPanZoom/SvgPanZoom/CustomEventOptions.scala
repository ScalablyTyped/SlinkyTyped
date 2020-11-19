package typingsSlinky.svgPanZoom.SvgPanZoom

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventOptions extends js.Object {
  
  /**
    * Creates a new SvgPanZoom instance with given element selector.
    *
    * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
    * @param  {Object} options        provides customization options at the initialization of the object.
    * @return {Instance}              Current instance
    */
  def instance(svg: String): Instance = js.native
  def instance(svg: String, options: Options): Instance = js.native
  def instance(svg: HTMLElement): Instance = js.native
  def instance(svg: HTMLElement, options: Options): Instance = js.native
  def instance(svg: SVGElement): Instance = js.native
  def instance(svg: SVGElement, options: Options): Instance = js.native
  @JSName("instance")
  var instance_Original: Instance = js.native
  
  var svgElement: SVGSVGElement = js.native
}
