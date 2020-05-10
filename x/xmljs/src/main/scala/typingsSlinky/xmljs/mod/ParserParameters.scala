package typingsSlinky.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserParameters extends js.Object {
  /**
    * Turn the tagsNames to lowercase
    */
  var lowercaseTagnames: js.UndefOr[Boolean] = js.native
  /**
    * Disables xml namespaces
    */
  var noNamespaces: js.UndefOr[Boolean] = js.native
  /**
    * Do not normalize whitespaces in text
    */
  var noNormalizeWhitespaces: js.UndefOr[Boolean] = js.native
  /**
    * Disable position tracing of sax
    */
  var noTracing: js.UndefOr[Boolean] = js.native
  /**
    * Do not trimtext and comment nodes
    */
  var noTrim: js.UndefOr[Boolean] = js.native
  /**
    * Whenever or not to use a strict parser
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Allow only predefined entities
    */
  var strictEntities: js.UndefOr[Boolean] = js.native
}

object ParserParameters {
  @scala.inline
  def apply(): ParserParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserParameters]
  }
  @scala.inline
  implicit class ParserParametersOps[Self <: ParserParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowercaseTagnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseTagnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercaseTagnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseTagnames")(js.undefined)
        ret
    }
    @scala.inline
    def withNoNamespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNamespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNamespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNoNormalizeWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNormalizeWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoNormalizeWhitespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNormalizeWhitespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTracing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTracing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTracing")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTrim")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictEntities")(js.undefined)
        ret
    }
  }
  
}

