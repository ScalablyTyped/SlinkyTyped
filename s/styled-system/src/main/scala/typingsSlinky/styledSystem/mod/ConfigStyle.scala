package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigStyle extends js.Object {
  /** A fallback scale object for when there isn't one defined in the `theme` object. */
  var defaultScale: js.UndefOr[Scale] = js.native
  /**
    * An array of multiple properties (e.g. `['marginLeft', 'marginRight']`) to which this style's value will be
    * assigned (overrides `property` when present).
    */
  var properties: js.UndefOr[
    js.Array[
      /* keyof csstype.csstype.Properties<string | 0> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 753 */ js.Any
    ]
  ] = js.native
  /** The CSS property to use in the returned style object (overridden by `properties` if present). */
  var property: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 754 */ js.Any
  ] = js.native
  /** A string referencing a key in the `theme` object. */
  var scale: js.UndefOr[String] = js.native
  /** A function to transform the raw value based on the scale. */
  var transform: js.UndefOr[js.Function2[/* value */ js.Any, /* scale */ js.UndefOr[Scale], _]] = js.native
}

object ConfigStyle {
  @scala.inline
  def apply(): ConfigStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigStyle]
  }
  @scala.inline
  implicit class ConfigStyleOps[Self <: ConfigStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultScale(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultScale")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(
      value: js.Array[
          /* keyof csstype.csstype.Properties<string | 0> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 753 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 754 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* value */ js.Any, /* scale */ js.UndefOr[Scale]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

