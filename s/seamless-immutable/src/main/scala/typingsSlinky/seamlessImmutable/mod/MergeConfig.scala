package typingsSlinky.seamlessImmutable.mod

import typingsSlinky.seamlessImmutable.seamlessImmutableStrings.merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeConfig extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var merger: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* config */ js.Any, _]] = js.native
  var mode: js.UndefOr[typingsSlinky.seamlessImmutable.seamlessImmutableStrings.replace | merge] = js.native
}

object MergeConfig {
  @scala.inline
  def apply(): MergeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeConfig]
  }
  @scala.inline
  implicit class MergeConfigOps[Self <: MergeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withMerger(value: (/* a */ js.Any, /* b */ js.Any, /* config */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merger")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMerger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merger")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: typingsSlinky.seamlessImmutable.seamlessImmutableStrings.replace | merge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

