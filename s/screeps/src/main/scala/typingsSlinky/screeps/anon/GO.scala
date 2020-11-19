package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.KH2O
import typingsSlinky.screeps.screepsStrings.LH2O
import typingsSlinky.screeps.screepsStrings.UH2O
import typingsSlinky.screeps.screepsStrings.UHO2
import typingsSlinky.screeps.screepsStrings.ZH2O
import typingsSlinky.screeps.screepsStrings.ZHO2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GO extends js.Object {
  
  var GH: typingsSlinky.screeps.screepsStrings.GH2O = js.native
  
  var GO: typingsSlinky.screeps.screepsStrings.GHO2 = js.native
  
  var KH: KH2O = js.native
  
  var KO: typingsSlinky.screeps.screepsStrings.KHO2 = js.native
  
  var LH: LH2O = js.native
  
  var LO: typingsSlinky.screeps.screepsStrings.LHO2 = js.native
  
  var UH: UH2O = js.native
  
  var UO: UHO2 = js.native
  
  var ZH: ZH2O = js.native
  
  var ZO: ZHO2 = js.native
}
object GO {
  
  @scala.inline
  def apply(
    GH: typingsSlinky.screeps.screepsStrings.GH2O,
    GO: typingsSlinky.screeps.screepsStrings.GHO2,
    KH: KH2O,
    KO: typingsSlinky.screeps.screepsStrings.KHO2,
    LH: LH2O,
    LO: typingsSlinky.screeps.screepsStrings.LHO2,
    UH: UH2O,
    UO: UHO2,
    ZH: ZH2O,
    ZO: ZHO2
  ): GO = {
    val __obj = js.Dynamic.literal(GH = GH.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], KH = KH.asInstanceOf[js.Any], KO = KO.asInstanceOf[js.Any], LH = LH.asInstanceOf[js.Any], LO = LO.asInstanceOf[js.Any], UH = UH.asInstanceOf[js.Any], UO = UO.asInstanceOf[js.Any], ZH = ZH.asInstanceOf[js.Any], ZO = ZO.asInstanceOf[js.Any])
    __obj.asInstanceOf[GO]
  }
  
  @scala.inline
  implicit class GOOps[Self <: GO] (val x: Self) extends AnyVal {
    
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
    def setGH(value: typingsSlinky.screeps.screepsStrings.GH2O): Self = this.set("GH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGO(value: typingsSlinky.screeps.screepsStrings.GHO2): Self = this.set("GO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKH(value: KH2O): Self = this.set("KH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKO(value: typingsSlinky.screeps.screepsStrings.KHO2): Self = this.set("KO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLH(value: LH2O): Self = this.set("LH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLO(value: typingsSlinky.screeps.screepsStrings.LHO2): Self = this.set("LO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUH(value: UH2O): Self = this.set("UH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUO(value: UHO2): Self = this.set("UO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZH(value: ZH2O): Self = this.set("ZH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZO(value: ZHO2): Self = this.set("ZO", value.asInstanceOf[js.Any])
  }
}
