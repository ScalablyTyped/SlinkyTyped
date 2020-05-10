package typingsSlinky.testingLibraryDom.queriesMod

import org.scalajs.dom.raw.Element
import typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByRoleOptions extends MatcherOptions {
  /**
    * If true includes elements in the query set that are usually excluded from
    * the accessibility tree. `role="none"` or `role="presentation"` are included
    * in either case.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Only considers  elements with the specified accessible name.
    */
  var name: js.UndefOr[
    String | js.RegExp | (js.Function2[/* accessibleName */ String, /* element */ Element, Boolean])
  ] = js.native
  /**
    * Includes every role used in the `role` attribute
    * For example *ByRole('progressbar', {queryFallbacks: true})` will find <div role="meter progresbar">`.
    */
  var queryFallbacks: js.UndefOr[Boolean] = js.native
}

object ByRoleOptions {
  @scala.inline
  def apply(): ByRoleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByRoleOptions]
  }
  @scala.inline
  implicit class ByRoleOptionsOps[Self <: ByRoleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFunction2(value: (/* accessibleName */ String, /* element */ Element) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNameRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(
      value: String | js.RegExp | (js.Function2[/* accessibleName */ String, /* element */ Element, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryFallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryFallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFallbacks")(js.undefined)
        ret
    }
  }
  
}

