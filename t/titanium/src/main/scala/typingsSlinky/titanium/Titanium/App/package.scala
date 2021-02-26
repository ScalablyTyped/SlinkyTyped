package typingsSlinky.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object App {
  
  /**
    * A module used to access Android application resources.
    */
  type Android = typingsSlinky.titanium.Titanium.Module
  
  /**
    * The App Properties module is used for storing application-related data in property/value pairs
    * that persist beyond application sessions and device power cycles.
    */
  type Properties = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Fired when a property is changed.
    */
  type PropertiesChangeEvent = typingsSlinky.titanium.Titanium.App.PropertiesBaseEvent
  
  /**
    * The top-level App iOS module, available only to iOS devices, that includes the facilities to
    * create and manage local notifications and background services.
    */
  type iOS = typingsSlinky.titanium.Titanium.Module
  
  /**
    * Fired after the user takes a screenshot, e.g. by pressing both the home and lock screen buttons.
    */
  type iOSScreenshotcapturedEvent = typingsSlinky.titanium.Titanium.App.iOSBaseEvent
  
  /**
    * Fired when the trait collection of the device changes, e.g. the user interface style.
    */
  type iOSTraitcollectionchangeEvent = typingsSlinky.titanium.Titanium.App.iOSBaseEvent
}
