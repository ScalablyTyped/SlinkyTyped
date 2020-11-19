package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to operations that manage buffers and streams that are protected to an enterprise identity. */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager")
@js.native
abstract class DataProtectionManager ()
  extends typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionManager
/* static members */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager")
@js.native
object DataProtectionManager extends js.Object {
  
  /**
    * Get the status of an enterprise protected buffer.
    * @param protectedData The buffer for which protection status is being queried.
    * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the buffer.
    */
  def getProtectionInfoAsync(protectedData: IBuffer): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
  
  /**
    * Get the status of an enterprise protected stream.
    * @param protectedStream The stream for which protection status is being queried.
    * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the stream.
    */
  def getStreamProtectionInfoAsync(protectedStream: IInputStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
  
  /**
    * Protect the data in a buffer to an enterprise identity.
    * @param data The buffer to be protected.
    * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @return When the call to this method completes successfully, it returns a BufferProtectUnprotectResult object that contains the status of the newly protected buffer.
    */
  def protectAsync(data: IBuffer, identity: String): IPromiseWithIAsyncOperation[
    typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult
  ] = js.native
  
  /**
    * Protect a stream of data to an enterprise identity.
    * @param unprotectedStream The input, unprotected stream.
    * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @param protectedStream The output, protected stream.
    * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the protected stream.
    */
  def protectStreamAsync(unprotectedStream: IInputStream, identity: String, protectedStream: IOutputStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
  
  /**
    * Removes the protection to an enterprise identity from a buffer.
    * @param data The buffer to be unprotected.
    * @return When the call to this method completes successfully, it returns a BufferProtectUnprotectResult object that contains the status of the unprotected buffer.
    */
  def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[
    typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult
  ] = js.native
  
  /**
    * Removes the protection to an enterprise identity from a stream of data.
    * @param protectedStream The input, protected stream.
    * @param unprotectedStream The output, unprotected stream.
    * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the unprotected stream.
    */
  def unprotectStreamAsync(protectedStream: IInputStream, unprotectedStream: IOutputStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
}
