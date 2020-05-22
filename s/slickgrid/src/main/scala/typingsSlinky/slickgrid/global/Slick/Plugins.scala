package typingsSlinky.slickgrid.global.Slick

import typingsSlinky.slickgrid.Slick.OnCommandEventArgs
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Plugins")
@js.native
object Plugins extends js.Object {
  @js.native
  class HeaderButtons[T /* <: SlickData */] ()
    extends typingsSlinky.slickgrid.Slick.Plugins.HeaderButtons[T] {
    /* CompleteClass */
    override var onCommand: typingsSlinky.slickgrid.Slick.Event[OnCommandEventArgs[T]] = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def init(grid: typingsSlinky.slickgrid.Slick.Grid[T]): Unit = js.native
  }
  
}

