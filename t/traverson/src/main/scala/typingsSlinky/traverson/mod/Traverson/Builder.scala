package typingsSlinky.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builder extends js.Object {
  def delete(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  def follow(first_pattern: String, rest_patterns: String*): Builder = js.native
  def get(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  def getResource(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  def getUrl(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  def json(): Builder = js.native
  def jsonHal(): Builder = js.native
  def newRequest(): Builder = js.native
  def patch(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  def post(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  def put(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  def setMediaType(type_name: String): Builder = js.native
  def withRequestOptions(options: js.Any): Builder = js.native
  def withTemplateParameters(parameters: js.Any): Builder = js.native
}

object Builder {
  @scala.inline
  def apply(
    delete: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    follow: (String, /* repeated */ String) => Builder,
    get: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    getResource: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    getUrl: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    json: () => Builder,
    jsonHal: () => Builder,
    newRequest: () => Builder,
    patch: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
    post: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
    put: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
    setMediaType: String => Builder,
    withRequestOptions: js.Any => Builder,
    withTemplateParameters: js.Any => Builder
  ): Builder = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), follow = js.Any.fromFunction2(follow), get = js.Any.fromFunction1(get), getResource = js.Any.fromFunction1(getResource), getUrl = js.Any.fromFunction1(getUrl), json = js.Any.fromFunction0(json), jsonHal = js.Any.fromFunction0(jsonHal), newRequest = js.Any.fromFunction0(newRequest), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), put = js.Any.fromFunction2(put), setMediaType = js.Any.fromFunction1(setMediaType), withRequestOptions = js.Any.fromFunction1(withRequestOptions), withTemplateParameters = js.Any.fromFunction1(withTemplateParameters))
    __obj.asInstanceOf[Builder]
  }
  @scala.inline
  implicit class BuilderOps[Self <: Builder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFollow(value: (String, /* repeated */ String) => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetResource(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUrl(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJson(value: () => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJsonHal(value: () => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonHal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRequest(value: () => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPatch(
      value: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPost(
      value: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPut(
      value: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMediaType(value: String => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMediaType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithRequestOptions(value: js.Any => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRequestOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithTemplateParameters(value: js.Any => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTemplateParameters")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

