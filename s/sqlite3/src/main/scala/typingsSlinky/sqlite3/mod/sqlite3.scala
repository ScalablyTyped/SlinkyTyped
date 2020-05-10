package typingsSlinky.sqlite3.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.sqlite3.AnonDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sqlite3 extends js.Object {
  var Database: Instantiable2[
    /* filename */ String, 
    js.UndefOr[/* callback */ js.Function1[/* err */ js.Error | Null, Unit]], 
    typingsSlinky.sqlite3.mod.Database
  ] = js.native
  var OPEN_CREATE: Double = js.native
  var OPEN_PRIVATECACHE: Double = js.native
  var OPEN_READONLY: Double = js.native
  var OPEN_READWRITE: Double = js.native
  var OPEN_SHAREDCACHE: Double = js.native
  var OPEN_URI: Double = js.native
  var RunResult: typingsSlinky.sqlite3.mod.RunResult = js.native
  var Statement: Instantiable0[typingsSlinky.sqlite3.mod.Statement] = js.native
  var cached: AnonDatabase = js.native
  def verbose(): this.type = js.native
}

object sqlite3 {
  @scala.inline
  def apply(
    Database: Instantiable2[
      /* filename */ String, 
      js.UndefOr[/* callback */ js.Function1[/* err */ js.Error | Null, Unit]], 
      Database
    ],
    OPEN_CREATE: Double,
    OPEN_PRIVATECACHE: Double,
    OPEN_READONLY: Double,
    OPEN_READWRITE: Double,
    OPEN_SHAREDCACHE: Double,
    OPEN_URI: Double,
    RunResult: RunResult,
    Statement: Instantiable0[Statement],
    cached: AnonDatabase,
    verbose: () => sqlite3
  ): sqlite3 = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], OPEN_CREATE = OPEN_CREATE.asInstanceOf[js.Any], OPEN_PRIVATECACHE = OPEN_PRIVATECACHE.asInstanceOf[js.Any], OPEN_READONLY = OPEN_READONLY.asInstanceOf[js.Any], OPEN_READWRITE = OPEN_READWRITE.asInstanceOf[js.Any], OPEN_SHAREDCACHE = OPEN_SHAREDCACHE.asInstanceOf[js.Any], OPEN_URI = OPEN_URI.asInstanceOf[js.Any], RunResult = RunResult.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], verbose = js.Any.fromFunction0(verbose))
    __obj.asInstanceOf[sqlite3]
  }
  @scala.inline
  implicit class sqlite3Ops[Self <: sqlite3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(
      value: Instantiable2[
          /* filename */ String, 
          js.UndefOr[/* callback */ js.Function1[/* err */ js.Error | Null, Unit]], 
          Database
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_CREATE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_CREATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_PRIVATECACHE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_PRIVATECACHE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_READONLY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_READONLY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_READWRITE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_READWRITE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_SHAREDCACHE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_SHAREDCACHE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_URI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunResult(value: RunResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement(value: Instantiable0[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCached(value: AnonDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: () => sqlite3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

