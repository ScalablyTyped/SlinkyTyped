package typingsSlinky.statMode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stat-mode", JSImport.Namespace)
  @js.native
  def apply(): Mode = js.native
  @JSImport("stat-mode", JSImport.Namespace)
  @js.native
  def apply(stat: Double): Mode = js.native
  @JSImport("stat-mode", JSImport.Namespace)
  @js.native
  def apply(stat: StatsMode): Mode = js.native
  
  @JSImport("stat-mode", "Group")
  @js.native
  class Group protected () extends RWX {
    def this(stat: StatsMode) = this()
  }
  object Group {
    
    @JSImport("stat-mode", "Group")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "Group.r")
    @js.native
    def r: Double = js.native
    @scala.inline
    def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Group.w")
    @js.native
    def w: Double = js.native
    @scala.inline
    def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Group.x")
    @js.native
    def x: Double = js.native
    @scala.inline
    def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("stat-mode", "Mode")
  @js.native
  class Mode () extends StObject {
    def this(stat: Double) = this()
    def this(stat: StatsMode) = this()
    
    var checkModeProperty: js.Any = js.native
    
    var group: Group = js.native
    
    def isBlockDevice(): Boolean = js.native
    def isBlockDevice(v: Boolean): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    def isCharacterDevice(v: Boolean): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    def isDirectory(v: Boolean): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    def isFIFO(v: Boolean): Boolean = js.native
    
    def isFile(): Boolean = js.native
    def isFile(v: Boolean): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    def isSocket(v: Boolean): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    def isSymbolicLink(v: Boolean): Boolean = js.native
    
    var others: Others = js.native
    
    var owner: Owner = js.native
    
    def setgid: Boolean = js.native
    def setgid_=(v: Boolean): Unit = js.native
    
    def setuid: Boolean = js.native
    def setuid_=(v: Boolean): Unit = js.native
    
    var stat: js.Any = js.native
    
    def sticky: Boolean = js.native
    def sticky_=(v: Boolean): Unit = js.native
    
    /**
      * Returns an octal representation of the `mode`, eg. "0754".
      *
      * http://en.wikipedia.org/wiki/File_system_permissions#Numeric_notation
      *
      * @return {String}
      * @api public
      */
    def toOctal(): String = js.native
  }
  
  @JSImport("stat-mode", "Others")
  @js.native
  class Others protected () extends RWX {
    def this(stat: StatsMode) = this()
  }
  object Others {
    
    @JSImport("stat-mode", "Others")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "Others.r")
    @js.native
    def r: Double = js.native
    @scala.inline
    def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Others.w")
    @js.native
    def w: Double = js.native
    @scala.inline
    def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Others.x")
    @js.native
    def x: Double = js.native
    @scala.inline
    def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("stat-mode", "Owner")
  @js.native
  class Owner protected () extends RWX {
    def this(stat: StatsMode) = this()
  }
  object Owner {
    
    @JSImport("stat-mode", "Owner")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "Owner.r")
    @js.native
    def r: Double = js.native
    @scala.inline
    def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Owner.w")
    @js.native
    def w: Double = js.native
    @scala.inline
    def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "Owner.x")
    @js.native
    def x: Double = js.native
    @scala.inline
    def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("stat-mode", "RWX")
  @js.native
  class RWX protected () extends StObject {
    def this(stat: StatsMode) = this()
    
    def execute: Boolean = js.native
    def execute_=(v: Boolean): Unit = js.native
    
    def read: Boolean = js.native
    def read_=(v: Boolean): Unit = js.native
    
    var stat: js.Any = js.native
    
    def write: Boolean = js.native
    def write_=(v: Boolean): Unit = js.native
  }
  object RWX {
    
    @JSImport("stat-mode", "RWX")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("stat-mode", "RWX.r")
    @js.native
    def r: Double = js.native
    @scala.inline
    def r_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "RWX.w")
    @js.native
    def w: Double = js.native
    @scala.inline
    def w_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("w")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("stat-mode", "RWX.x")
    @js.native
    def x: Double = js.native
    @scala.inline
    def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("stat-mode", "isStatsMode")
  @js.native
  def isStatsMode(v: js.Any): /* is stat-mode.stat-mode.StatsMode */ Boolean = js.native
  
  /* Inlined std.Pick<node.fs.Stats, 'mode'> */
  @js.native
  trait StatsMode extends StObject {
    
    var mode: Double = js.native
  }
  object StatsMode {
    
    @scala.inline
    def apply(mode: Double): StatsMode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsMode]
    }
    
    @scala.inline
    implicit class StatsModeMutableBuilder[Self <: StatsMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
