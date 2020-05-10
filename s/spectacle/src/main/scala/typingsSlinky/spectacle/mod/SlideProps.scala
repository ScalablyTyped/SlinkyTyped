package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideProps extends BaseProps {
  var align: js.UndefOr[alignType] = js.native
  var contentStyles: js.UndefOr[CSSProperties] = js.native
  var controlColor: js.UndefOr[String] = js.native
  var dispatch: js.UndefOr[js.Function0[Unit]] = js.native
  var hash: js.UndefOr[Double | String] = js.native
  var history: js.UndefOr[js.Any] = js.native
   // Needs a type, see https://github.com/ReactTraining/history
  var id: js.UndefOr[String] = js.native
  var lastSlideIndex: js.UndefOr[Double] = js.native
  var notes: js.UndefOr[String] = js.native
  var onActive: js.UndefOr[js.Function1[/* slideIndex */ String | Double, Unit]] = js.native
  var progressColor: js.UndefOr[String] = js.native
  var slideIndex: js.UndefOr[Double] = js.native
  var state: js.UndefOr[String] = js.native
  var transition: js.UndefOr[js.Array[transitionType]] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var transitionIn: js.UndefOr[js.Array[transitionType]] = js.native
  var transitionOut: js.UndefOr[js.Array[transitionType]] = js.native
}

object SlideProps {
  @scala.inline
  def apply(): SlideProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideProps]
  }
  @scala.inline
  implicit class SlidePropsOps[Self <: SlideProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: alignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyles(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withControlColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDispatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSlideIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSlideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlideIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActive(value: /* slideIndex */ String | Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActive")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: js.Array[transitionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionIn(value: js.Array[transitionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionIn")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionOut(value: js.Array[transitionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOut")(js.undefined)
        ret
    }
  }
  
}

