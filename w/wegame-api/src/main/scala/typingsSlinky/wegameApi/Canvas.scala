package typingsSlinky.wegameApi

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.wegameApi.wegameApiStrings.`2d`
import typingsSlinky.wegameApi.wegameApiStrings.webgl
import typingsSlinky.wegameApi.wx.types.RenderingContextConfig
import typingsSlinky.wegameApi.wx.types.ToTempFileParams
import typingsSlinky.wegameApi.wx.types.ToTempFileSyncParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends js.Object {
  /**
    * 画布的高度
    */
  var height: Double = js.native
  /**
    * 画布的宽度
    */
  var width: Double = js.native
  /**
    * 获取画布对象的绘图上下文
    * @param contextType 上下文类型
    * @param contextAttributes webgl 上下文属性，仅当 contextType 为 webgl 时有效
    */
  @JSName("getContext")
  def getContext_2d(contextType: `2d`): CanvasRenderingContext2D | WxWebGLRenderingContext = js.native
  @JSName("getContext")
  def getContext_2d(contextType: `2d`, contextAttributes: RenderingContextConfig): CanvasRenderingContext2D | WxWebGLRenderingContext = js.native
  @JSName("getContext")
  def getContext_webgl(contextType: webgl): CanvasRenderingContext2D | WxWebGLRenderingContext = js.native
  @JSName("getContext")
  def getContext_webgl(contextType: webgl, contextAttributes: RenderingContextConfig): CanvasRenderingContext2D | WxWebGLRenderingContext = js.native
  /**
    * 把画布上的绘制内容以一个 data URI 的格式返回
    */
  def toDataURL(): String = js.native
  /**
    * 将当前 Canvas 保存为一个临时文件，并生成相应的临时文件路径。
    */
  def toTempFilePath(p: ToTempFileParams): Unit = js.native
  /**
    * toTempFilePath 的同步版本
    */
  def toTempFilePathSync(p: ToTempFileSyncParams): String = js.native
}

