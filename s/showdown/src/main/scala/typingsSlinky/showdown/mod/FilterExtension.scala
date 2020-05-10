package typingsSlinky.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If you'd just like to do everything yourself,you can specify a filter property.
  * The filter property should be a function that acts as a callback.
  * 
  * @example
  * ```ts
  * let myExt: ShowdownExtension = { 
  *   type: 'lang',
  *   filter: (text: string, converter: Converter) => text.replace('#', '*') 
  * };
  * ```
  */
@js.native
trait FilterExtension extends Extension_ {
  var filter: js.UndefOr[
    js.Function3[
      /* text */ String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      String
    ]
  ] = js.native
}

object FilterExtension {
  @scala.inline
  def apply(`type`: String): FilterExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExtension]
  }
  @scala.inline
  implicit class FilterExtensionOps[Self <: FilterExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(
      value: (/* text */ String, /* converter */ Converter, /* options */ js.UndefOr[ConverterOptions]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

