package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Possible options for row locking. Used in conjuction with `find` calls:
  */
@js.native
trait TransactionLock extends StObject {
  
  // 'SHARE'
  var KEY_SHARE: TransactionLockLevelKeyShare = js.native
  
  // 'KEY SHARE'
  var NO_KEY_UPDATE: TransactionLockLevelNoKeyUpdate = js.native
  
  // 'UPDATE'
  var SHARE: TransactionLockLevelShare = js.native
  
  var UPDATE: TransactionLockLevelUpdate = js.native
}
object TransactionLock {
  
  @scala.inline
  def apply(
    KEY_SHARE: TransactionLockLevelKeyShare,
    NO_KEY_UPDATE: TransactionLockLevelNoKeyUpdate,
    SHARE: TransactionLockLevelShare,
    UPDATE: TransactionLockLevelUpdate
  ): TransactionLock = {
    val __obj = js.Dynamic.literal(KEY_SHARE = KEY_SHARE.asInstanceOf[js.Any], NO_KEY_UPDATE = NO_KEY_UPDATE.asInstanceOf[js.Any], SHARE = SHARE.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionLock]
  }
  
  @scala.inline
  implicit class TransactionLockMutableBuilder[Self <: TransactionLock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKEY_SHARE(value: TransactionLockLevelKeyShare): Self = StObject.set(x, "KEY_SHARE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_KEY_UPDATE(value: TransactionLockLevelNoKeyUpdate): Self = StObject.set(x, "NO_KEY_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHARE(value: TransactionLockLevelShare): Self = StObject.set(x, "SHARE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE(value: TransactionLockLevelUpdate): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
  }
}
