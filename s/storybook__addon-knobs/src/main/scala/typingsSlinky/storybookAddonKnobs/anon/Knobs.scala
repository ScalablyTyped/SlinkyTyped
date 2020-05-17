package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knobs extends js.Object {
  var knobs: Record[String, KnobStoreKnob] = js.native
  var timestamp: js.UndefOr[Double] = js.native
}

object Knobs {
  @scala.inline
  def apply(knobs: Record[String, KnobStoreKnob]): Knobs = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knobs]
  }
  @scala.inline
  implicit class KnobsOps[Self <: Knobs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnobs(value: Record[String, KnobStoreKnob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

