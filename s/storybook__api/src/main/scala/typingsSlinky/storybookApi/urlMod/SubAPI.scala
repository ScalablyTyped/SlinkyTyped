package typingsSlinky.storybookApi.urlMod

import typingsSlinky.reachRouter.mod.NavigateOptions
import typingsSlinky.storybookApi.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  def getQueryParam(key: String): js.UndefOr[String] = js.native
  def getUrlState(): AnonPath = js.native
  def navigateUrl(url: String, options: NavigateOptions[js.Object]): Unit = js.native
  def setQueryParams(input: QueryParams): Unit = js.native
}

object SubAPI {
  @scala.inline
  def apply(
    getQueryParam: String => js.UndefOr[String],
    getUrlState: () => AnonPath,
    navigateUrl: (String, NavigateOptions[js.Object]) => Unit,
    setQueryParams: QueryParams => Unit
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getQueryParam = js.Any.fromFunction1(getQueryParam), getUrlState = js.Any.fromFunction0(getUrlState), navigateUrl = js.Any.fromFunction2(navigateUrl), setQueryParams = js.Any.fromFunction1(setQueryParams))
    __obj.asInstanceOf[SubAPI]
  }
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetQueryParam(value: String => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUrlState(value: () => AnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrlState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNavigateUrl(value: (String, NavigateOptions[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetQueryParams(value: QueryParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQueryParams")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

