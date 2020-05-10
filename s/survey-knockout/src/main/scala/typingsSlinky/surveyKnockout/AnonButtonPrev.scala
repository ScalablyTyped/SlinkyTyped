package typingsSlinky.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonButtonPrev extends js.Object {
  var button: String = js.native
  var buttonAdd: String = js.native
  var buttonNext: String = js.native
  var buttonPrev: String = js.native
  var buttonRemove: String = js.native
  var navigation: String = js.native
  var progress: String = js.native
  var progressBar: String = js.native
  var progressBottom: String = js.native
  var progressContainer: String = js.native
  var progressText: String = js.native
  var progressTop: String = js.native
  var root: String = js.native
  var separator: String = js.native
  var title: String = js.native
}

object AnonButtonPrev {
  @scala.inline
  def apply(
    button: String,
    buttonAdd: String,
    buttonNext: String,
    buttonPrev: String,
    buttonRemove: String,
    navigation: String,
    progress: String,
    progressBar: String,
    progressBottom: String,
    progressContainer: String,
    progressText: String,
    progressTop: String,
    root: String,
    separator: String,
    title: String
  ): AnonButtonPrev = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonAdd = buttonAdd.asInstanceOf[js.Any], buttonNext = buttonNext.asInstanceOf[js.Any], buttonPrev = buttonPrev.asInstanceOf[js.Any], buttonRemove = buttonRemove.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], progressBottom = progressBottom.asInstanceOf[js.Any], progressContainer = progressContainer.asInstanceOf[js.Any], progressText = progressText.asInstanceOf[js.Any], progressTop = progressTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonPrev]
  }
  @scala.inline
  implicit class AnonButtonPrevOps[Self <: AnonButtonPrev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonAdd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

