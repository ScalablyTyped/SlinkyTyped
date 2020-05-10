package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@testing-library/dom.@testing-library/dom/config.Config> */
@js.native
trait PartialConfig extends js.Object {
  var asyncUtilTimeout: js.UndefOr[Double] = js.native
  var asyncWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, _], js.Promise[_]]] = js.native
  var defaultHidden: js.UndefOr[Boolean] = js.native
  var testIdAttribute: js.UndefOr[String] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncUtilTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncUtilTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncUtilTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncUtilTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncWrapper(value: /* cb */ js.Function1[/* repeated */ js.Any, _] => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncWrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAsyncWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withTestIdAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIdAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestIdAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIdAttribute")(js.undefined)
        ret
    }
  }
  
}

