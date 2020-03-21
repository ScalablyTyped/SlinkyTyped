package typingsSlinky.uifabricUtilities

import typingsSlinky.uifabricUtilities.customizationsMod.ISettings
import typingsSlinky.uifabricUtilities.customizationsMod.ISettingsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/customizations/mergeSettings", JSImport.Namespace)
@js.native
object mergeSettingsMod extends js.Object {
  def mergeScopedSettings(): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings, newSettings: ISettings): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings, newSettings: ISettingsFunction): ISettings = js.native
  def mergeSettings(): ISettings = js.native
  def mergeSettings(oldSettings: ISettings): ISettings = js.native
  def mergeSettings(oldSettings: ISettings, newSettings: ISettings): ISettings = js.native
  def mergeSettings(oldSettings: ISettings, newSettings: ISettingsFunction): ISettings = js.native
}

