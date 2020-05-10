package typingsSlinky.uriJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends js.Object {
  var absolutePath: js.UndefOr[Boolean] = js.native
  var domainHost: js.UndefOr[Boolean] = js.native
  var scheme: String = js.native
  var unicodeSupport: js.UndefOr[Boolean] = js.native
  def parse(components: ParentComponents, options: Options): Components = js.native
  def serialize(components: Components, options: Options): ParentComponents = js.native
}

object URISchemeHandler {
  @scala.inline
  def apply[Components, Options, ParentComponents](
    parse: (ParentComponents, Options) => Components,
    scheme: String,
    serialize: (Components, Options) => ParentComponents
  ): URISchemeHandler[Components, Options, ParentComponents] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), scheme = scheme.asInstanceOf[js.Any], serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
  }
  @scala.inline
  implicit class URISchemeHandlerOps[Self[components, options, parentcomponents] <: URISchemeHandler[components, options, parentcomponents], Components, Options, ParentComponents] (val x: Self[Components, Options, ParentComponents]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Components, Options, ParentComponents] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Components, Options, ParentComponents]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Components, Options, ParentComponents]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Components, Options, ParentComponents]) with Other]
    @scala.inline
    def withParse(value: (ParentComponents, Options) => Components): Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScheme(value: String): Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialize(value: (Components, Options) => ParentComponents): Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAbsolutePath(value: Boolean): Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePath: Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainHost(value: Boolean): Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainHost: Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainHost")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeSupport(value: Boolean): Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeSupport: Self[Components, Options, ParentComponents] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeSupport")(js.undefined)
        ret
    }
  }
  
}

