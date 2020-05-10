package typingsSlinky.youtubeDl.mod

import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Youtubedl extends js.Object {
  def on(event: String, func: js.Function1[/* info */ Info, Unit]): this.type = js.native
  def pipe(stream: WriteStream): this.type = js.native
}

object Youtubedl {
  @scala.inline
  def apply(on: (String, js.Function1[/* info */ Info, Unit]) => Youtubedl, pipe: WriteStream => Youtubedl): Youtubedl = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), pipe = js.Any.fromFunction1(pipe))
    __obj.asInstanceOf[Youtubedl]
  }
  @scala.inline
  implicit class YoutubedlOps[Self <: Youtubedl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: (String, js.Function1[/* info */ Info, Unit]) => Youtubedl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPipe(value: WriteStream => Youtubedl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

