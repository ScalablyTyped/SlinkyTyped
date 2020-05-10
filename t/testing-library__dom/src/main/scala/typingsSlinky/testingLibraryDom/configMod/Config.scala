package typingsSlinky.testingLibraryDom.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var asyncUtilTimeout: Double = js.native
  var defaultHidden: Boolean = js.native
  var testIdAttribute: String = js.native
  def asyncWrapper(cb: js.Function1[/* repeated */ js.Any, _]): js.Promise[_] = js.native
}

object Config {
  @scala.inline
  def apply(
    asyncUtilTimeout: Double,
    asyncWrapper: js.Function1[/* repeated */ js.Any, _] => js.Promise[_],
    defaultHidden: Boolean,
    testIdAttribute: String
  ): Config = {
    val __obj = js.Dynamic.literal(asyncUtilTimeout = asyncUtilTimeout.asInstanceOf[js.Any], asyncWrapper = js.Any.fromFunction1(asyncWrapper), defaultHidden = defaultHidden.asInstanceOf[js.Any], testIdAttribute = testIdAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def withAsyncWrapper(value: js.Function1[/* repeated */ js.Any, _] => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncWrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestIdAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIdAttribute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

