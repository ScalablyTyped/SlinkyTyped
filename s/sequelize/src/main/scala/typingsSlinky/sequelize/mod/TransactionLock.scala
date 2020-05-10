package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible options for row locking. Used in conjuction with `find` calls:
  */
@js.native
trait TransactionLock extends js.Object {
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
  implicit class TransactionLockOps[Self <: TransactionLock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKEY_SHARE(value: TransactionLockLevelKeyShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEY_SHARE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_KEY_UPDATE(value: TransactionLockLevelNoKeyUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_KEY_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHARE(value: TransactionLockLevelShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHARE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPDATE(value: TransactionLockLevelUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

