package typingsSlinky.winrt.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaExtensionManager extends StObject {
  
  def registerAudioDecoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerAudioDecoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  
  def registerAudioEncoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerAudioEncoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  
  def registerByteStreamHandler(activatableClassId: String, fileExtension: String, mimeType: String): Unit = js.native
  def registerByteStreamHandler(activatableClassId: String, fileExtension: String, mimeType: String, configuration: IPropertySet): Unit = js.native
  
  def registerSchemeHandler(activatableClassId: String, scheme: String): Unit = js.native
  def registerSchemeHandler(activatableClassId: String, scheme: String, configuration: IPropertySet): Unit = js.native
  
  def registerVideoDecoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerVideoDecoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
  
  def registerVideoEncoder(activatableClassId: String, inputSubtype: String, outputSubtype: String): Unit = js.native
  def registerVideoEncoder(
    activatableClassId: String,
    inputSubtype: String,
    outputSubtype: String,
    configuration: IPropertySet
  ): Unit = js.native
}
