package typingsSlinky.screeps.anon

import typingsSlinky.screeps.ResourceConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant, false> */
@js.native
trait StoreRESOURCEENERGYMinera extends js.Object {
  
  var G: Double = js.native
  
  var GH: Double = js.native
  
  var GH2O: Double = js.native
  
  var GHO2: Double = js.native
  
  var GO: Double = js.native
  
  var H: Double = js.native
  
  var K: Double = js.native
  
  var KH: Double = js.native
  
  var KH2O: Double = js.native
  
  var KHO2: Double = js.native
  
  var KO: Double = js.native
  
  var L: Double = js.native
  
  var LH: Double = js.native
  
  var LH2O: Double = js.native
  
  var LHO2: Double = js.native
  
  var LO: Double = js.native
  
  var O: Double = js.native
  
  var OH: Double = js.native
  
  var U: Double = js.native
  
  var UH: Double = js.native
  
  var UH2O: Double = js.native
  
  var UHO2: Double = js.native
  
  var UL: Double = js.native
  
  var UO: Double = js.native
  
  var X: Double = js.native
  
  var XGH2O: Double = js.native
  
  var XGHO2: Double = js.native
  
  var XKH2O: Double = js.native
  
  var XKHO2: Double = js.native
  
  var XLH2O: Double = js.native
  
  var XLHO2: Double = js.native
  
  var XUH2O: Double = js.native
  
  var XUHO2: Double = js.native
  
  var XZH2O: Double = js.native
  
  var XZHO2: Double = js.native
  
  var Z: Double = js.native
  
  var ZH: Double = js.native
  
  var ZH2O: Double = js.native
  
  var ZHO2: Double = js.native
  
  var ZK: Double = js.native
  
  var ZO: Double = js.native
  
  var alloy: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var battery: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var biomass: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var cell: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var circuit: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var composite: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var concentrate: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var condensate: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var crystal: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var device: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var emanation: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var energy: Double = js.native
  
  var essence: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var extract: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var fixtures: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var frame: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  /**
    * Returns capacity of this store for the specified resource. For a general purpose store, it returns total capacity if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  
  /**
    * Returns free capacity for the store. For a limited store, it returns the capacity available for the specified resource if `resource` is defined and valid for this store.
    * @param resource The type of the resource.
    * @returns Returns available capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  
  /**
    * Returns the capacity used by the specified resource, or total used capacity for general purpose stores if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns used capacity number, or `null` in case of a not valid `resource` for this store type.
    */
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  
  var ghodium_melt: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var hydraulics: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var keanium_bar: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var lemergium_bar: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var liquid: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var machine: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var metal: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var microchip: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var mist: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var muscle: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var ops: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var organism: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var organoid: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var oxidant: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var phlegm: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var power: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var purifier: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var reductant: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var silicon: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var spirit: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var switch: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var tissue: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var transistor: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var tube: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var utrium_bar: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var wire: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var zynthium_bar: typingsSlinky.screeps.screepsNumbers.`0` = js.native
}
