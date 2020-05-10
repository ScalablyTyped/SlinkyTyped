package typingsSlinky.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reduced_[TResult] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: Boolean = js.native
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: TResult = js.native
}

object Reduced_ {
  @scala.inline
  def apply[TResult](`@@transducerSlashreduced`: Boolean, `@@transducerSlashvalue`: TResult): Reduced_[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced_[TResult]]
  }
  @scala.inline
  implicit class Reduced_Ops[Self[tresult] <: Reduced_[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def `with@@transducerSlashreduced`(value: Boolean): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@transducer/reduced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `with@@transducerSlashvalue`(value: TResult): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@transducer/value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

