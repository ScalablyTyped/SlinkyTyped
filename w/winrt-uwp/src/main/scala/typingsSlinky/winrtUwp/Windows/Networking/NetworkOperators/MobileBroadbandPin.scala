package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the properties and methods associated with a mobile broadband PIN. */
@js.native
trait MobileBroadbandPin extends StObject {
  
  /** Gets the number of attempts remaining before the mobile broadband PIN is blocked. */
  var attemptsRemaining: Double = js.native
  
  /**
    * Starts an asynchronous operation to change an already-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def changeAsync(currentPin: String, newPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  
  /**
    * Starts an asynchronous operation to disable a previously-enabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def disableAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  
  /**
    * Starts an asynchronous operation to enable a previously-disabled mobile broadband PIN.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def enableAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  
  /** Gets a boolean value that indicates if the mobile broadband PIN is enabled. */
  var enabled: Boolean = js.native
  
  /**
    * Starts an asynchronous operation to get the current mobile broadband PIN from the user.
    * @param currentPin The current mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def enterAsync(currentPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
  
  /** Gets the format for a mobile broadband PIN. */
  var format: MobileBroadbandPinFormat = js.native
  
  /** Gets the lock state for a mobile broadband PIN. */
  var lockState: MobileBroadbandPinLockState = js.native
  
  /** Gets the maximum length, in bytes, of the mobile broadband PIN. */
  var maxLength: Double = js.native
  
  /** Gets the minimum length, in bytes, of the mobile broadband PIN. */
  var minLength: Double = js.native
  
  /** Gets the PIN type for a mobile broadband PIN. */
  var `type`: MobileBroadbandPinType = js.native
  
  /**
    * Starts an asynchronous operation to unblock a previously-blocked mobile broadband PIN using a PIN unlock key (PUK).
    * @param pinUnblockKey The PIN unblock key.
    * @param newPin The new mobile broadband PIN.
    * @return An asynchronous operation that returns the result.
    */
  def unblockAsync(pinUnblockKey: String, newPin: String): IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult] = js.native
}
object MobileBroadbandPin {
  
  @scala.inline
  def apply(
    attemptsRemaining: Double,
    changeAsync: (String, String) => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    disableAsync: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    enableAsync: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    enabled: Boolean,
    enterAsync: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult],
    format: MobileBroadbandPinFormat,
    lockState: MobileBroadbandPinLockState,
    maxLength: Double,
    minLength: Double,
    `type`: MobileBroadbandPinType,
    unblockAsync: (String, String) => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]
  ): MobileBroadbandPin = {
    val __obj = js.Dynamic.literal(attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any], changeAsync = js.Any.fromFunction2(changeAsync), disableAsync = js.Any.fromFunction1(disableAsync), enableAsync = js.Any.fromFunction1(enableAsync), enabled = enabled.asInstanceOf[js.Any], enterAsync = js.Any.fromFunction1(enterAsync), format = format.asInstanceOf[js.Any], lockState = lockState.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], unblockAsync = js.Any.fromFunction2(unblockAsync))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPin]
  }
  
  @scala.inline
  implicit class MobileBroadbandPinMutableBuilder[Self <: MobileBroadbandPin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptsRemaining(value: Double): Self = StObject.set(x, "attemptsRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeAsync(value: (String, String) => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]): Self = StObject.set(x, "changeAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisableAsync(value: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]): Self = StObject.set(x, "disableAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableAsync(value: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]): Self = StObject.set(x, "enableAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterAsync(value: String => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]): Self = StObject.set(x, "enterAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: MobileBroadbandPinFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockState(value: MobileBroadbandPinLockState): Self = StObject.set(x, "lockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MobileBroadbandPinType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnblockAsync(value: (String, String) => IPromiseWithIAsyncOperation[MobileBroadbandPinOperationResult]): Self = StObject.set(x, "unblockAsync", js.Any.fromFunction2(value))
  }
}
