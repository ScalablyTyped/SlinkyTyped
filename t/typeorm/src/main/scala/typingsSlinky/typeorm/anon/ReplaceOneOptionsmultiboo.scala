package typingsSlinky.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typeorm.typeorm/driver/mongodb/typings.ReplaceOneOptions & {  multi :boolean | undefined} */
@js.native
trait ReplaceOneOptionsmultiboo extends js.Object {
  
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  /**
    * Update operation is an upsert.
    */
  var upsert: js.UndefOr[Boolean] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[Double | String] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[Double] = js.native
}
object ReplaceOneOptionsmultiboo {
  
  @scala.inline
  def apply(): ReplaceOneOptionsmultiboo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOneOptionsmultiboo]
  }
  
  @scala.inline
  implicit class ReplaceOneOptionsmultibooOps[Self <: ReplaceOneOptionsmultiboo] (val x: Self) extends AnyVal {
    
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
    def setBypassDocumentValidation(value: Boolean): Self = this.set("bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassDocumentValidation: Self = this.set("bypassDocumentValidation", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
    
    @scala.inline
    def setW(value: Double | String): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
}
