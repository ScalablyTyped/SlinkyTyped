package typingsSlinky.stampit.mod.stampit

import typingsSlinky.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Initializer` function context.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
  */
@js.native
trait InitializerContext[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /** An array of the arguments passed into the `Stamp`, including the options argument. */
  // ! above description from the specification is obscure
  var args: js.Array[_] = js.native
  /** The object instance being produced by the `Stamp`. If the initializer returns a value other than `undefined`, it replaces the instance. */
  var instance: Obj = js.native
  /** A reference to the `Stamp` producing the instance. */
  var stamp: S̤t̤a̤m̤p̤ = js.native
}

object InitializerContext {
  @scala.inline
  def apply[Obj, S̤t̤a̤m̤p̤](args: js.Array[_], instance: Obj, stamp: S̤t̤a̤m̤p̤): InitializerContext[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializerContext[Obj, S̤t̤a̤m̤p̤]]
  }
  @scala.inline
  implicit class InitializerContextOps[Self[obj, s̤t̤a̤m̤p̤] <: InitializerContext[obj, s̤t̤a̤m̤p̤], Obj, S̤t̤a̤m̤p̤] (val x: Self[Obj, S̤t̤a̤m̤p̤]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Obj, S̤t̤a̤m̤p̤] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Obj, S̤t̤a̤m̤p̤]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Obj, S̤t̤a̤m̤p̤]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Obj, S̤t̤a̤m̤p̤]) with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: Obj): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStamp(value: S̤t̤a̤m̤p̤): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

