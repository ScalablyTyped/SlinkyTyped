package typingsSlinky.tldjs

import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRules extends js.Object {
  var extractHostname: js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
    ]
  ] = js.native
  var rules: js.UndefOr[js.Any] = js.native
  var validHosts: js.UndefOr[js.Array[String]] = js.native
}

object AnonRules {
  @scala.inline
  def apply(): AnonRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRules]
  }
  @scala.inline
  implicit class AnonRulesOps[Self <: AnonRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtractHostname(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withValidHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validHosts")(js.undefined)
        ret
    }
  }
  
}

