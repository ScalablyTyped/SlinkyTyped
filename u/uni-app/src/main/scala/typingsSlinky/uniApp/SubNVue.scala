package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.`fade-in`
import typingsSlinky.uniApp.uniAppStrings.`fade-out`
import typingsSlinky.uniApp.uniAppStrings.`pop-in`
import typingsSlinky.uniApp.uniAppStrings.`pop-out`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-bottom`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-left`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-right`
import typingsSlinky.uniApp.uniAppStrings.`slide-in-top`
import typingsSlinky.uniApp.uniAppStrings.`slide-out-bottom`
import typingsSlinky.uniApp.uniAppStrings.`slide-out-left`
import typingsSlinky.uniApp.uniAppStrings.`slide-out-right`
import typingsSlinky.uniApp.uniAppStrings.`slide-out-top`
import typingsSlinky.uniApp.uniAppStrings.`zoom-fade-in`
import typingsSlinky.uniApp.uniAppStrings.`zoom-fade-out`
import typingsSlinky.uniApp.uniAppStrings.`zoom-in`
import typingsSlinky.uniApp.uniAppStrings.`zoom-out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubNVue extends StObject {
  
  /**
    * 隐藏原生子窗体
    */
  def hide(): Unit = js.native
  @JSName("hide")
  def hide_fadeout(options: `fade-out`): Unit = js.native
  @JSName("hide")
  def hide_popout(options: `pop-out`): Unit = js.native
  @JSName("hide")
  def hide_slideoutbottom(options: `slide-out-bottom`): Unit = js.native
  @JSName("hide")
  def hide_slideoutleft(options: `slide-out-left`): Unit = js.native
  @JSName("hide")
  def hide_slideoutright(options: `slide-out-right`): Unit = js.native
  @JSName("hide")
  def hide_slideouttop(options: `slide-out-top`): Unit = js.native
  @JSName("hide")
  def hide_zoomfadein(options: `zoom-fade-in`): Unit = js.native
  @JSName("hide")
  def hide_zoomin(options: `zoom-in`): Unit = js.native
  
  /**
    * 监听消息
    */
  def onMessage(): Unit = js.native
  def onMessage(success: js.Function0[Unit]): Unit = js.native
  
  /**
    * 发送消息
    */
  def postMessage(): Unit = js.native
  
  /**
    * 设置原生子窗体的样式
    */
  def setStyle(): Unit = js.native
  def setStyle(options: SubNVuesSetStyleOptions): Unit = js.native
  
  /**
    * 显示原生子窗体
    */
  def show(): Unit = js.native
  @JSName("show")
  def show_fadein(options: `fade-in`): Unit = js.native
  @JSName("show")
  def show_popin(options: `pop-in`): Unit = js.native
  @JSName("show")
  def show_slideinbottom(options: `slide-in-bottom`): Unit = js.native
  @JSName("show")
  def show_slideinleft(options: `slide-in-left`): Unit = js.native
  @JSName("show")
  def show_slideinright(options: `slide-in-right`): Unit = js.native
  @JSName("show")
  def show_slideintop(options: `slide-in-top`): Unit = js.native
  @JSName("show")
  def show_zoomfadeout(options: `zoom-fade-out`): Unit = js.native
  @JSName("show")
  def show_zoomout(options: `zoom-out`): Unit = js.native
}
