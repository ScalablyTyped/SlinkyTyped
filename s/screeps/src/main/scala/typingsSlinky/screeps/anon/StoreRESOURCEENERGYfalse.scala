package typingsSlinky.screeps.anon

import typingsSlinky.screeps.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY, false> */
@js.native
trait StoreRESOURCEENERGYfalse extends StObject {
  
  var G: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var GH: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var GH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var GHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var GO: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var H: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var K: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var KH: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var KH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var KHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var KO: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var L: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var LH: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var LH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var LHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var LO: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var OH: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var U: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var UH: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var UH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var UHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var UL: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var UO: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var X: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XGH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XGHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XKH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XKHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XLH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XLHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XUH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XUHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XZH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var XZHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var Z: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var ZH: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var ZH2O: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var ZHO2: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var ZK: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
  var ZO: typingsSlinky.screeps.screepsNumbers.`0` = js.native
  
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
