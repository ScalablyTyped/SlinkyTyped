package typingsSlinky.stampit.mod.stampit

import typingsSlinky.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameters received by the current `.composers` function.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
  */
@js.native
trait ComposerParameters[S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /** The list of composables the `Stamp` was just composed of. */
  var composables: js.Array[Composable] = js.native
  /** The result of the `Composable`s composition. */
  var stamp: S̤t̤a̤m̤p̤ = js.native
}

object ComposerParameters {
  @scala.inline
  def apply[S̤t̤a̤m̤p̤](composables: js.Array[Composable], stamp: S̤t̤a̤m̤p̤): ComposerParameters[S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal(composables = composables.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposerParameters[S̤t̤a̤m̤p̤]]
  }
  @scala.inline
  implicit class ComposerParametersOps[Self[s̤t̤a̤m̤p̤] <: ComposerParameters[s̤t̤a̤m̤p̤], S̤t̤a̤m̤p̤] (val x: Self[S̤t̤a̤m̤p̤]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S̤t̤a̤m̤p̤] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S̤t̤a̤m̤p̤]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S̤t̤a̤m̤p̤] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S̤t̤a̤m̤p̤] with Other]
    @scala.inline
    def withComposables(value: js.Array[Composable]): Self[S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStamp(value: S̤t̤a̤m̤p̤): Self[S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

