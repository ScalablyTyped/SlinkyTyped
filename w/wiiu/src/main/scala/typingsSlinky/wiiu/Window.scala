package typingsSlinky.wiiu

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.wiiu.anon.Typeofwiiu
import typingsSlinky.wiiu.wiiuStrings.wiiu_imageview_change_content
import typingsSlinky.wiiu.wiiuStrings.wiiu_imageview_change_viewmode
import typingsSlinky.wiiu.wiiuStrings.wiiu_imageview_end
import typingsSlinky.wiiu.wiiuStrings.wiiu_imageview_error
import typingsSlinky.wiiu.wiiuStrings.wiiu_imageview_start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangecontent(`type`: wiiu_imageview_change_content, listener: js.Function1[/* ev */ CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangecontent(
    `type`: wiiu_imageview_change_content,
    listener: js.Function1[/* ev */ CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangeviewmode(`type`: wiiu_imageview_change_viewmode, listener: js.Function1[/* ev */ CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangeviewmode(
    `type`: wiiu_imageview_change_viewmode,
    listener: js.Function1[/* ev */ CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewend(`type`: wiiu_imageview_end, listener: js.Function1[/* ev */ CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewend(`type`: wiiu_imageview_end, listener: js.Function1[/* ev */ CustomEvent, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewerror(`type`: wiiu_imageview_error, listener: js.Function1[/* ev */ CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewerror(`type`: wiiu_imageview_error, listener: js.Function1[/* ev */ CustomEvent, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewstart(`type`: wiiu_imageview_start, listener: js.Function1[/* ev */ CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewstart(`type`: wiiu_imageview_start, listener: js.Function1[/* ev */ CustomEvent, _], useCapture: Boolean): Unit = js.native
  
  var wiiu: Typeofwiiu = js.native
}
