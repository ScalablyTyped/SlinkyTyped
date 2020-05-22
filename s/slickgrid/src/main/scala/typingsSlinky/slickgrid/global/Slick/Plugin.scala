package typingsSlinky.slickgrid.global.Slick

import typingsSlinky.slickgrid.Slick.PluginOptions
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Plugin")
@js.native
class Plugin[T /* <: SlickData */] ()
  extends typingsSlinky.slickgrid.Slick.Plugin[T] {
  def this(options: PluginOptions) = this()
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def init(grid: typingsSlinky.slickgrid.Slick.Grid[T]): Unit = js.native
}

