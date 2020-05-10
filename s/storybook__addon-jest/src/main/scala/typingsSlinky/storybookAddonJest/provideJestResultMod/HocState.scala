package typingsSlinky.storybookAddonJest.provideJestResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HocState extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var storyName: js.UndefOr[String] = js.native
  var tests: js.UndefOr[js.Array[Test]] = js.native
}

object HocState {
  @scala.inline
  def apply(): HocState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HocState]
  }
  @scala.inline
  implicit class HocStateOps[Self <: HocState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withStoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyName")(js.undefined)
        ret
    }
    @scala.inline
    def withTests(value: js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(js.undefined)
        ret
    }
  }
  
}

