package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replacement details used in and array for replacing multiple items.
  */
@js.native
trait ReplacementDetail extends js.Object {
  
  /**
    * What to search for.
    */
  var `0`: Pattern = js.native
  
  /**
    * The replacement string or function
    */
  var `1`: ReplacementValue = js.native
  
  /**
    * Replacement scope. If not explicitly specified and `regex` uses flag g,
    * `scope` is 'all'.
    */
  var `2`: js.UndefOr[MatchScope | Null] = js.native
}
object ReplacementDetail {
  
  @scala.inline
  def apply(`0`: Pattern, `1`: ReplacementValue): ReplacementDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementDetail]
  }
  
  @scala.inline
  implicit class ReplacementDetailOps[Self <: ReplacementDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set0RegExp(value: js.RegExp): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set0(value: Pattern): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Function2(
      value: (/* substring */ MatchSubString, /* repeated */ String | Double | NamedGroupsArray) => String
    ): Self = this.set("1", js.Any.fromFunction2(value))
    
    @scala.inline
    def set1(value: ReplacementValue): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: MatchScope): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
    
    @scala.inline
    def set2Null: Self = this.set("2", null)
  }
}
