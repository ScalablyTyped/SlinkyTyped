package typingsSlinky.uniDashApp

import typingsSlinky.uniDashApp.uniDashAppStrings.`fade-in`
import typingsSlinky.uniDashApp.uniDashAppStrings.`fade-out`
import typingsSlinky.uniDashApp.uniDashAppStrings.`pop-in`
import typingsSlinky.uniDashApp.uniDashAppStrings.`pop-out`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-in-bottom`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-in-left`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-in-right`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-in-top`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-out-bottom`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-out-left`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-out-right`
import typingsSlinky.uniDashApp.uniDashAppStrings.`slide-out-top`
import typingsSlinky.uniDashApp.uniDashAppStrings.`zoom-fade-in`
import typingsSlinky.uniDashApp.uniDashAppStrings.`zoom-fade-out`
import typingsSlinky.uniDashApp.uniDashAppStrings.`zoom-in`
import typingsSlinky.uniDashApp.uniDashAppStrings.`zoom-out`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubNVue extends js.Object {
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

