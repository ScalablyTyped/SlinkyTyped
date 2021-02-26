package typingsSlinky.tar

import typingsSlinky.minipass.mod.^
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.zlibMod.ZlibOptions
import typingsSlinky.tar.anon.CreateOptionsFileOptionss
import typingsSlinky.tar.anon.ExtractOptionsFileOptions
import typingsSlinky.tar.anon.ListOptionsFileOptionssyn
import typingsSlinky.tar.tarBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tar", "Extract")
  @js.native
  def Extract_(opts: String): ParseStream = js.native
  @JSImport("tar", "Extract")
  @js.native
  def Extract_(opts: ExtractOptions): ParseStream = js.native
  
  @JSImport("tar", "Pack")
  @js.native
  def Pack(): PackStream = js.native
  @JSImport("tar", "Pack")
  @js.native
  def Pack(props: HeaderProperties): PackStream = js.native
  
  @JSImport("tar", "Parse")
  @js.native
  def Parse(): ParseStream = js.native
  
  @JSImport("tar", "blockSize")
  @js.native
  val blockSize: Double = js.native
  
  @JSImport("tar", "c")
  @js.native
  def c(options: CreateOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "c")
  @js.native
  def c(
    options: CreateOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("tar", "c")
  @js.native
  def c(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = js.native
  @JSImport("tar", "c")
  @js.native
  def c_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
  @JSImport("tar", "c")
  @js.native
  def c_Readable(
    options: CreateOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Readable = js.native
  
  @JSImport("tar", "create")
  @js.native
  def create(options: CreateOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "create")
  @js.native
  def create(
    options: CreateOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("tar", "create")
  @js.native
  def create(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = js.native
  @JSImport("tar", "create")
  @js.native
  def create_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
  @JSImport("tar", "create")
  @js.native
  def create_Readable(
    options: CreateOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Readable = js.native
  
  @JSImport("tar", "extract")
  @js.native
  def extract(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract(
    options: ExtractOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract(options: ExtractOptionsFileOptions): Unit = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract(options: ExtractOptions): Writable = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract_Promise(options: ExtractOptions with FileOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract_Promise(options: ExtractOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract_Writable(
    options: ExtractOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "extract")
  @js.native
  def extract_Writable(
    options: ExtractOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  
  @JSImport("tar", "fieldEnds")
  @js.native
  val fieldEnds: js.Array[Double] = js.native
  
  @JSImport("tar", "fieldOffs")
  @js.native
  val fieldOffs: js.Array[Double] = js.native
  
  @JSImport("tar", "fieldSize")
  @js.native
  val fieldSize: js.Array[Double] = js.native
  
  @JSImport("tar", "headerSize")
  @js.native
  val headerSize: Double = js.native
  
  object knownExtended {
    
    @JSImport("tar", "knownExtended")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "knownExtended.atime")
    @js.native
    def atime: Boolean = js.native
    @scala.inline
    def atime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.charset")
    @js.native
    def charset: Boolean = js.native
    @scala.inline
    def charset_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charset")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.comment")
    @js.native
    def comment: Boolean = js.native
    @scala.inline
    def comment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.ctime")
    @js.native
    def ctime: Boolean = js.native
    @scala.inline
    def ctime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.gid")
    @js.native
    def gid: Boolean = js.native
    @scala.inline
    def gid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.gname")
    @js.native
    def gname: Boolean = js.native
    @scala.inline
    def gname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gname")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.linkpat")
    @js.native
    def linkpat: Boolean = js.native
    @scala.inline
    def linkpat_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkpat")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.mtime")
    @js.native
    def mtime: Boolean = js.native
    @scala.inline
    def mtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.path")
    @js.native
    def path: Boolean = js.native
    @scala.inline
    def path_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.realtime")
    @js.native
    def realtime: Boolean = js.native
    @scala.inline
    def realtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realtime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.security")
    @js.native
    def security: Boolean = js.native
    @scala.inline
    def security_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("security")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.size")
    @js.native
    def size: Boolean = js.native
    @scala.inline
    def size_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.uid")
    @js.native
    def uid: Boolean = js.native
    @scala.inline
    def uid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.uname")
    @js.native
    def uname: Boolean = js.native
    @scala.inline
    def uname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uname")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tar", "list")
  @js.native
  def list(): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(options: ListOptions with FileOptions): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(
    options: ListOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(options: ListOptions with FileOptions, fileList: js.Array[String]): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(
    options: ListOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(
    options: js.UndefOr[scala.Nothing],
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(options: js.UndefOr[scala.Nothing], fileList: js.Array[String]): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(
    options: js.UndefOr[scala.Nothing],
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "list")
  @js.native
  def list(options: ListOptionsFileOptionssyn): Unit = js.native
  @JSImport("tar", "list")
  @js.native
  def list(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = js.native
  @JSImport("tar", "list")
  @js.native
  def list_Promise(options: ListOptions with FileOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "list")
  @js.native
  def list_Promise(options: ListOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  
  object modes {
    
    @JSImport("tar", "modes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "modes.gexec")
    @js.native
    def gexec: Double = js.native
    @scala.inline
    def gexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gexec")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.gread")
    @js.native
    def gread: Double = js.native
    @scala.inline
    def gread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gread")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.gwrite")
    @js.native
    def gwrite: Double = js.native
    @scala.inline
    def gwrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gwrite")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.oexec")
    @js.native
    def oexec: Double = js.native
    @scala.inline
    def oexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oexec")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.oread")
    @js.native
    def oread: Double = js.native
    @scala.inline
    def oread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oread")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.owrite")
    @js.native
    def owrite: Double = js.native
    @scala.inline
    def owrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("owrite")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.sgid")
    @js.native
    def sgid: Double = js.native
    @scala.inline
    def sgid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sgid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.suid")
    @js.native
    def suid: Double = js.native
    @scala.inline
    def suid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.svtx")
    @js.native
    def svtx: Double = js.native
    @scala.inline
    def svtx_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svtx")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.uexec")
    @js.native
    def uexec: Double = js.native
    @scala.inline
    def uexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uexec")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.uread")
    @js.native
    def uread: Double = js.native
    @scala.inline
    def uread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uread")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.uwrite")
    @js.native
    def uwrite: Double = js.native
    @scala.inline
    def uwrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uwrite")(x.asInstanceOf[js.Any])
  }
  
  object numeric {
    
    @JSImport("tar", "numeric")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "numeric.atime")
    @js.native
    def atime: Boolean = js.native
    @scala.inline
    def atime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.cksum")
    @js.native
    def cksum: Boolean = js.native
    @scala.inline
    def cksum_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cksum")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.ctime")
    @js.native
    def ctime: Boolean = js.native
    @scala.inline
    def ctime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.dev")
    @js.native
    def dev: Boolean = js.native
    @scala.inline
    def dev_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dev")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.devmaj")
    @js.native
    def devmaj: Boolean = js.native
    @scala.inline
    def devmaj_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devmaj")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.devmin")
    @js.native
    def devmin: Boolean = js.native
    @scala.inline
    def devmin_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devmin")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.gid")
    @js.native
    def gid: Boolean = js.native
    @scala.inline
    def gid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.ino")
    @js.native
    def ino: Boolean = js.native
    @scala.inline
    def ino_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ino")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.mode")
    @js.native
    def mode: Boolean = js.native
    @scala.inline
    def mode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.mtime")
    @js.native
    def mtime: Boolean = js.native
    @scala.inline
    def mtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.nlink")
    @js.native
    def nlink: Boolean = js.native
    @scala.inline
    def nlink_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nlink")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.size")
    @js.native
    def size: Boolean = js.native
    @scala.inline
    def size_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.uid")
    @js.native
    def uid: Boolean = js.native
    @scala.inline
    def uid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tar", "r")
  @js.native
  def r(options: ReplaceOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "r")
  @js.native
  def r(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("tar", "r")
  @js.native
  def r(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "r")
  @js.native
  def r(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  
  @JSImport("tar", "replace")
  @js.native
  def replace(options: ReplaceOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "replace")
  @js.native
  def replace(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("tar", "replace")
  @js.native
  def replace(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "replace")
  @js.native
  def replace(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  
  @JSImport("tar", "t")
  @js.native
  def t(): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(options: ListOptions with FileOptions): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(
    options: ListOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(options: ListOptions with FileOptions, fileList: js.Array[String]): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(
    options: ListOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(
    options: js.UndefOr[scala.Nothing],
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(options: js.UndefOr[scala.Nothing], fileList: js.Array[String]): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(
    options: js.UndefOr[scala.Nothing],
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "t")
  @js.native
  def t(options: ListOptionsFileOptionssyn): Unit = js.native
  @JSImport("tar", "t")
  @js.native
  def t(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = js.native
  @JSImport("tar", "t")
  @js.native
  def t_Promise(options: ListOptions with FileOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "t")
  @js.native
  def t_Promise(options: ListOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  
  object types {
    
    @JSImport("tar", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "types.A")
    @js.native
    def A: String = js.native
    @scala.inline
    def A_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.BlockDevice")
    @js.native
    def BlockDevice: String = js.native
    @scala.inline
    def BlockDevice_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockDevice")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.CharacterDevice")
    @js.native
    def CharacterDevice: String = js.native
    @scala.inline
    def CharacterDevice_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CharacterDevice")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.ContiguousFile")
    @js.native
    def ContiguousFile: String = js.native
    @scala.inline
    def ContiguousFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContiguousFile")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.ContinuationFile")
    @js.native
    def ContinuationFile: String = js.native
    @scala.inline
    def ContinuationFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContinuationFile")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.D")
    @js.native
    def D: String = js.native
    @scala.inline
    def D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("D")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.Directory")
    @js.native
    def Directory: String = js.native
    @scala.inline
    def Directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Directory")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.ExtendedHeader")
    @js.native
    def ExtendedHeader: String = js.native
    @scala.inline
    def ExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtendedHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.FIFO")
    @js.native
    def FIFO: String = js.native
    @scala.inline
    def FIFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIFO")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.File")
    @js.native
    def File: String = js.native
    @scala.inline
    def File_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.GNUDumpDir")
    @js.native
    def GNUDumpDir: String = js.native
    @scala.inline
    def GNUDumpDir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GNUDumpDir")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.GlobalExtendedHeader")
    @js.native
    def GlobalExtendedHeader: String = js.native
    @scala.inline
    def GlobalExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalExtendedHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.I")
    @js.native
    def I: String = js.native
    
    @JSImport("tar", "types.INode")
    @js.native
    def INode: String = js.native
    @scala.inline
    def INode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INode")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def I_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.K")
    @js.native
    def K: String = js.native
    @scala.inline
    def K_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("K")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.L")
    @js.native
    def L: String = js.native
    @scala.inline
    def L_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("L")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.Link")
    @js.native
    def Link: String = js.native
    @scala.inline
    def Link_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.M")
    @js.native
    def M: String = js.native
    @scala.inline
    def M_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.N")
    @js.native
    def N: String = js.native
    @scala.inline
    def N_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.NextFileHasLonLinkPath")
    @js.native
    def NextFileHasLonLinkPath: String = js.native
    @scala.inline
    def NextFileHasLonLinkPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NextFileHasLonLinkPath")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.NextFileHasLongPath")
    @js.native
    def NextFileHasLongPath: String = js.native
    @scala.inline
    def NextFileHasLongPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NextFileHasLongPath")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.\u0000")
    @js.native
    def Null: String = js.native
    
    @scala.inline
    def Null_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0000")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.OldExtendedHeader")
    @js.native
    def OldExtendedHeader: String = js.native
    @scala.inline
    def OldExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OldExtendedHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.OldFile")
    @js.native
    def OldFile: String = js.native
    @scala.inline
    def OldFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OldFile")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.S")
    @js.native
    def S: String = js.native
    @scala.inline
    def S_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.SolarisACL")
    @js.native
    def SolarisACL: String = js.native
    @scala.inline
    def SolarisACL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SolarisACL")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.SymbolicLick")
    @js.native
    def SymbolicLick: String = js.native
    @scala.inline
    def SymbolicLick_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SymbolicLick")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.TapeVolumeHeader")
    @js.native
    def TapeVolumeHeader: String = js.native
    @scala.inline
    def TapeVolumeHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapeVolumeHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.V")
    @js.native
    def V: String = js.native
    @scala.inline
    def V_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.X")
    @js.native
    def X_ : String = js.native
    
    @scala.inline
    def X__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.")
    @js.native
    def _empty: String = js.native
    
    @scala.inline
    def _empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.g")
    @js.native
    def g: String = js.native
    @scala.inline
    def g_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.x")
    @js.native
    def x: String = js.native
    @scala.inline
    def x_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.0")
    @js.native
    val `0`: String = js.native
    
    @JSImport("tar", "types.1")
    @js.native
    val `1`: String = js.native
    
    @JSImport("tar", "types.2")
    @js.native
    val `2`: String = js.native
    
    @JSImport("tar", "types.3")
    @js.native
    val `3`: String = js.native
    
    @JSImport("tar", "types.4")
    @js.native
    val `4`: String = js.native
    
    @JSImport("tar", "types.5")
    @js.native
    val `5`: String = js.native
    
    @JSImport("tar", "types.6")
    @js.native
    val `6`: String = js.native
    
    @JSImport("tar", "types.7")
    @js.native
    val `7`: String = js.native
  }
  
  @JSImport("tar", "u")
  @js.native
  def u(options: ReplaceOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "u")
  @js.native
  def u(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("tar", "u")
  @js.native
  def u(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "u")
  @js.native
  def u(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  
  @JSImport("tar", "update")
  @js.native
  def update(options: ReplaceOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "update")
  @js.native
  def update(
    options: ReplaceOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("tar", "update")
  @js.native
  def update(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "update")
  @js.native
  def update(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = js.native
  
  @JSImport("tar", "x")
  @js.native
  def x(
    options: ExtractOptions with FileOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("tar", "x")
  @js.native
  def x(
    options: ExtractOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("tar", "x")
  @js.native
  def x(options: ExtractOptionsFileOptions): Unit = js.native
  @JSImport("tar", "x")
  @js.native
  def x(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = js.native
  @JSImport("tar", "x")
  @js.native
  def x(options: ExtractOptions): Writable = js.native
  @JSImport("tar", "x")
  @js.native
  def x(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
  @JSImport("tar", "x")
  @js.native
  def x_Promise(options: ExtractOptions with FileOptions): js.Promise[Unit] = js.native
  @JSImport("tar", "x")
  @js.native
  def x_Promise(options: ExtractOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("tar", "x")
  @js.native
  def x_Writable(
    options: ExtractOptions,
    fileList: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  @JSImport("tar", "x")
  @js.native
  def x_Writable(
    options: ExtractOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
  
  @js.native
  trait CreateOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.native
    
    /**
      * Alias for follow.
      */
    var L: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for presevePaths.
      */
    var P: js.UndefOr[Boolean] = js.native
    
    /**
      * The current working directory for creating the archive. Defaults to process.cwd().
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to add the entry to the archive, or false to omit it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.native
    
    /**
      * Set to true to pack the targets of symbolic links. Without this
      * option, symbolic links are archived as such.
      */
    var follow: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to any truthy value to create a gzipped archive,
      * or an object with settings for zlib.Gzip()
      */
    var gzip: js.UndefOr[Boolean | ZlibOptions] = js.native
    
    /**
      * Alias for follow.
      */
    var h: js.UndefOr[Boolean] = js.native
    
    /**
      * The mode to set on the created file archive.
      */
    var mode: js.UndefOr[Double] = js.native
    
    /**
      * Do not recursively archive the contents of directories.
      */
    var noDirRecurse: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress pax extended headers. Note that this means that long paths and
      * linkpaths will be truncated, and large or negative numeric values
      * may be interpreted incorrectly.
      */
    var noPax: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that will get called with (message, data)
      * for any warnings encountered.
      */
    var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.native
    
    /**
      * Omit metadata that is system-specific: ctime, atime, uid, gid, uname,
      * gname, dev, ino, and nlink. Note that mtime is still included,
      * because this is necessary other time-based operations.
      */
    var portable: js.UndefOr[Boolean] = js.native
    
    /**
      * A path portion to prefix onto the entries in the archive.
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Allow absolute paths. By default, / is stripped from absolute paths.
      */
    var preservePaths: js.UndefOr[Boolean] = js.native
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for gzip.
      */
    var z: js.UndefOr[Boolean | ZlibOptions] = js.native
  }
  object CreateOptions {
    
    @scala.inline
    def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean | ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setL(value: Boolean): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
      
      @scala.inline
      def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
      
      @scala.inline
      def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      @scala.inline
      def setP(value: Boolean): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "P", js.undefined)
      
      @scala.inline
      def setPortable(value: Boolean): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setZ(value: Boolean | ZlibOptions): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  @js.native
  trait ExtractOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.native
    
    var Directory: js.UndefOr[Boolean] = js.native
    
    /**
      * Extract files relative to the specified directory. Defaults to
      * process.cwd(). If provided, this must exist and must be a directory.
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to emit the entry from the archive, or false to skip it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.native
    
    /**
      * Set to a number to force ownership of all extracted files and folders,
      * and all implicitly created directories, to be owned by the specified
      * group id, regardless of the gid field in the archive. Cannot be used
      * along with preserveOwner. Requires also setting a uid option
      */
    var gid: js.UndefOr[Double] = js.native
    
    /**
      * Alias for keep.
      */
    var k: js.UndefOr[Boolean] = js.native
    
    /**
      * Do not overwrite existing files. In particular, if a file appears more
      * than once in an archive, later copies will not overwrite earlier copies
      */
    var keep: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for keep.
      */
    var `keep-existing`: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for newer.
      */
    var `keep-newer`: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for newer.
      */
    var `keep-newer-files`: js.UndefOr[Boolean] = js.native
    
    var m: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum size of meta entries that is supported. Defaults to 1 MB.
      */
    var maxMetaEntrySize: js.UndefOr[Double] = js.native
    
    // The following options are mostly internal, but can be modified in some
    // advanced use cases, such as re-using caches between runs.
    /**
      * The maximum buffer size for fs.read() operations (in bytes). Defaults to 16 MB.
      */
    var maxReadSize: js.UndefOr[Double] = js.native
    
    /**
      * Set to true to keep the existing file on disk if it's newer than
      * the file in the archive.
      */
    var newer: js.UndefOr[Boolean] = js.native
    
    var `no-mtime`: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true to omit writing mtime value for extracted entries.
      * [Alias: m, no-mtime]
      */
    var noMtime: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that gets called with (entry) for each entry that passes the
      * filter.
      */
    var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.native
    
    /**
      * A function that will get called with (message, data)
      * for any warnings encountered.
      */
    var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.native
    
    /**
      * Alias for preserveOwner.
      */
    var p: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    /**
      * If true, tar will set the uid and gid of extracted entries to the uid
      * and gid fields in the archive. This defaults to true when run as root,
      * and false otherwise. If false, then files and directories will be set
      * with the owner and group of the user running the process. This is
      * similar to -p in tar(1), but ACLs and other system-specific data is
      * never unpacked in this implementation, and modes
      * are set by default already.
      */
    var preserveOwner: js.UndefOr[Boolean] = js.native
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * Remove the specified number of leading path elements. Pathnames with
      * fewer elements will be silently skipped. Note that the pathname
      * is edited after applying the filter, but before security checks.
      */
    var strip: js.UndefOr[Double] = js.native
    
    /**
      * Alias for strip.
      */
    var `strip-components`: js.UndefOr[Double] = js.native
    
    /**
      * Alias for strip.
      */
    var stripComponents: js.UndefOr[Double] = js.native
    
    /**
      * Provide a function that takes an entry object, and returns a stream,
      * or any falsey value. If a stream is provided, then that stream's data
      * will be written instead of the contents of the archive entry. If a
      * falsey value is provided, then the entry is written to disk as normal.
      * (To exclude items from extraction, use the filter option described above.)
      */
    var transform: js.UndefOr[js.Function1[/* entry */ ReadEntry, js.UndefOr[WritableStream | `false` | Null]]] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * Set to a number to force ownership of all extracted files and folders,
      * and all implicitly created directories, to be owned by the specified
      * user id, regardless of the uid field in the archive. Cannot be used
      * along with preserveOwner. Requires also setting a gid option.
      */
    var uid: js.UndefOr[Double] = js.native
    
    /**
      * Unlink files before creating them. Without this option, tar overwrites
      * existing files, which preserves existing hardlinks. With this option,
      * existing hardlinks will be broken, as will any symlink that would
      * affect the location of an extracted file.
      */
    var unlink: js.UndefOr[Boolean] = js.native
  }
  object ExtractOptions {
    
    @scala.inline
    def apply(): ExtractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractOptions]
    }
    
    @scala.inline
    implicit class ExtractOptionsMutableBuilder[Self <: ExtractOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "Directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "Directory", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setK(value: Boolean): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-existing`(value: Boolean): Self = StObject.set(x, "keep-existing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-existingUndefined`: Self = StObject.set(x, "keep-existing", js.undefined)
      
      @scala.inline
      def `setKeep-newer`(value: Boolean): Self = StObject.set(x, "keep-newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-newer-files`(value: Boolean): Self = StObject.set(x, "keep-newer-files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-newer-filesUndefined`: Self = StObject.set(x, "keep-newer-files", js.undefined)
      
      @scala.inline
      def `setKeep-newerUndefined`: Self = StObject.set(x, "keep-newer", js.undefined)
      
      @scala.inline
      def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      @scala.inline
      def setM(value: Boolean): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMaxMetaEntrySize(value: Double): Self = StObject.set(x, "maxMetaEntrySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMetaEntrySizeUndefined: Self = StObject.set(x, "maxMetaEntrySize", js.undefined)
      
      @scala.inline
      def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      @scala.inline
      def setNewer(value: Boolean): Self = StObject.set(x, "newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewerUndefined: Self = StObject.set(x, "newer", js.undefined)
      
      @scala.inline
      def `setNo-mtime`(value: Boolean): Self = StObject.set(x, "no-mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-mtimeUndefined`: Self = StObject.set(x, "no-mtime", js.undefined)
      
      @scala.inline
      def setNoMtime(value: Boolean): Self = StObject.set(x, "noMtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMtimeUndefined: Self = StObject.set(x, "noMtime", js.undefined)
      
      @scala.inline
      def setOnentry(value: /* entry */ ReadEntry => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
      
      @scala.inline
      def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      @scala.inline
      def setP(value: Boolean): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPreserveOwner(value: Boolean): Self = StObject.set(x, "preserveOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveOwnerUndefined: Self = StObject.set(x, "preserveOwner", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-components`(value: Double): Self = StObject.set(x, "strip-components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-componentsUndefined`: Self = StObject.set(x, "strip-components", js.undefined)
      
      @scala.inline
      def setStripComponents(value: Double): Self = StObject.set(x, "stripComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripComponentsUndefined: Self = StObject.set(x, "stripComponents", js.undefined)
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      @scala.inline
      def setTransform(value: /* entry */ ReadEntry => js.UndefOr[WritableStream | `false` | Null]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setUnlink(value: Boolean): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
  
  @js.native
  trait Fields_ extends StObject {
    
    var cksum: Double = js.native
    
    var devmaj: Double = js.native
    
    var devmin: Double = js.native
    
    var fill: Double = js.native
    
    var gid: Double = js.native
    
    var gname: Double = js.native
    
    var linkpath: Double = js.native
    
    var mode: Double = js.native
    
    var mtime: Double = js.native
    
    var path: Double = js.native
    
    var prefix: Double = js.native
    
    var size: Double = js.native
    
    var `type`: Double = js.native
    
    var uid: Double = js.native
    
    var uname: Double = js.native
    
    var ustar: Double = js.native
    
    var ustarvar: Double = js.native
  }
  object Fields_ {
    
    @scala.inline
    def apply(
      cksum: Double,
      devmaj: Double,
      devmin: Double,
      fill: Double,
      gid: Double,
      gname: Double,
      linkpath: Double,
      mode: Double,
      mtime: Double,
      path: Double,
      prefix: Double,
      size: Double,
      `type`: Double,
      uid: Double,
      uname: Double,
      ustar: Double,
      ustarvar: Double
    ): Fields_ = {
      val __obj = js.Dynamic.literal(cksum = cksum.asInstanceOf[js.Any], devmaj = devmaj.asInstanceOf[js.Any], devmin = devmin.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], gname = gname.asInstanceOf[js.Any], linkpath = linkpath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any], ustar = ustar.asInstanceOf[js.Any], ustarvar = ustarvar.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields_]
    }
    
    @scala.inline
    implicit class Fields_MutableBuilder[Self <: Fields_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCksum(value: Double): Self = StObject.set(x, "cksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevmaj(value: Double): Self = StObject.set(x, "devmaj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevmin(value: Double): Self = StObject.set(x, "devmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGname(value: Double): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkpath(value: Double): Self = StObject.set(x, "linkpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: Double): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: Double): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUname(value: Double): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUstar(value: Double): Self = StObject.set(x, "ustar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUstarvar(value: Double): Self = StObject.set(x, "ustarvar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileOptions extends StObject {
    
    /**
      * Alias for file.
      */
    var f: js.UndefOr[String] = js.native
    
    /**
      * Uses the given file as the input or output of this function.
      */
    var file: js.UndefOr[String] = js.native
  }
  object FileOptions {
    
    @scala.inline
    def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  @js.native
  trait FileStat
    extends Readable
       with Fields_ {
    
    var blockRemain: Double = js.native
    
    var header: HeaderProperties = js.native
    
    var ignore: Boolean = js.native
    
    var meta: Boolean = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    var remain: Double = js.native
    
    var startBlockSize: Double = js.native
  }
  
  @js.native
  trait HeaderProperties extends StObject {
    
    var devmaj: js.UndefOr[Double] = js.native
    
    var devmin: js.UndefOr[Double] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var gname: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Double] = js.native
    
    var noProprietary: js.UndefOr[Boolean] = js.native
    
    var path: String = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var uid: js.UndefOr[Double] = js.native
    
    var uname: js.UndefOr[String] = js.native
  }
  object HeaderProperties {
    
    @scala.inline
    def apply(path: String): HeaderProperties = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderProperties]
    }
    
    @scala.inline
    implicit class HeaderPropertiesMutableBuilder[Self <: HeaderProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevmaj(value: Double): Self = StObject.set(x, "devmaj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevmajUndefined: Self = StObject.set(x, "devmaj", js.undefined)
      
      @scala.inline
      def setDevmin(value: Double): Self = StObject.set(x, "devmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevminUndefined: Self = StObject.set(x, "devmin", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setNoProprietary(value: Boolean): Self = StObject.set(x, "noProprietary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoProprietaryUndefined: Self = StObject.set(x, "noProprietary", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
    }
  }
  
  @js.native
  trait ListOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.native
    
    /**
      * Extract files relative to the specified directory. Defaults to
      * process.cwd(). If provided, this must exist and must be a directory.
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to emit the entry from the archive, or false to skip it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ FileStat, Boolean]] = js.native
    
    /**
      * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
      */
    var maxReadSize: js.UndefOr[Double] = js.native
    
    /**
      * By default, entry streams are resumed immediately after the call to
      * onentry. Set noResume: true to suppress this behavior. Note that by
      * opting into this, the stream will never complete until the entry
      * data is consumed.
      */
    var noResume: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that gets called with (entry) for each entry that passes the
      * filter. This is important for when both file and sync are set, because
      * it will be called synchronously.
      */
    var onentry: js.UndefOr[js.Function1[/* entry */ FileStat, Unit]] = js.native
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object ListOptions {
    
    @scala.inline
    def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit class ListOptionsMutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* entry */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      @scala.inline
      def setNoResume(value: Boolean): Self = StObject.set(x, "noResume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResumeUndefined: Self = StObject.set(x, "noResume", js.undefined)
      
      @scala.inline
      def setOnentry(value: /* entry */ FileStat => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait PackStream extends ReadWriteStream {
    
    var _buffer: js.Array[Stream] = js.native
    
    var _currentEntry: js.Any = js.native
    
    var _global: HeaderProperties = js.native
    
    var _needDrain: Boolean = js.native
    
    var _noProprietary: Boolean = js.native
    
    var _paused: Boolean = js.native
    
    var _pipeRoot: Stream = js.native
    
    def _process(): Unit = js.native
    
    var _processing: Boolean = js.native
    
    def add(stream: Stream): Boolean = js.native
    
    def addGlobal(props: HeaderProperties): Unit = js.native
    
    def destroy(): Unit = js.native
  }
  
  @js.native
  trait ParseStream extends ReadWriteStream {
    
    var _ended: Boolean = js.native
    
    def _process(c: Buffer): Unit = js.native
    
    def _startEntry(c: Buffer): Unit = js.native
    
    var _stream: Stream = js.native
    
    def _streamEnd(): Unit = js.native
    
    var position: Double = js.native
  }
  
  @js.native
  trait ReadEntry
    extends ^
       with HeaderProperties {
    
    /** The number of 512-byte blocks remaining to be written into the stream. */
    var blockRemain: Double = js.native
    
    /** The extended metadata object provided to the constructor. */
    var extended: js.Any = js.native
    
    /** The global extended metadata object provided to the constructor. */
    var globalExtended: js.Any = js.native
    
    /** Whether this entry should be ignored. */
    var ignore: Boolean = js.native
    
    /**
      * True if this represents metadata about the next entry, false if it
      * represents a filesystem object.
      */
    var meta: Boolean = js.native
    
    /** The number of bytes remaining to be written into the stream. */
    var remain: Double = js.native
  }
  
  @js.native
  trait ReplaceOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.native
    
    /**
      * Alias for follow.
      */
    var L: js.UndefOr[Boolean] = js.native
    
    /**
      * Extract files relative to the specified directory. Defaults to
      * process.cwd(). If provided, this must exist and must be a directory.
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Required. Write the tarball archive to the specified filename.
      */
    var file: String = js.native
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to emit the entry from the archive, or false to skip it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.native
    
    /**
      * Set to true to pack the targets of symbolic links. Without this
      * option, symbolic links are archived as such.
      */
    var follow: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to any truthy value to create a gzipped archive,
      * or an object with settings for zlib.Gzip()
      */
    var gzip: js.UndefOr[Boolean | ZlibOptions] = js.native
    
    /**
      * Alias for follow.
      */
    var h: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
      */
    var maxReadSize: js.UndefOr[Double] = js.native
    
    /**
      * Do not recursively archive the contents of directories.
      */
    var noDirRecurse: js.UndefOr[Boolean] = js.native
    
    /**
      * uppress pax extended headers. Note that this means that long paths and
      * linkpaths will be truncated, and large or negative numeric values
      * may be interpreted incorrectly.
      */
    var noPax: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that will get called with (message, data)
      * for any warnings encountered.
      */
    var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.native
    
    /**
      * A path portion to prefix onto the entries in the archive.
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Allow absolute paths. By default, / is stripped from absolute paths.
      */
    var preservePaths: js.UndefOr[Boolean] = js.native
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * Act synchronously. If this is set, then any provided file will be
      * fully written after the call to tar.c.
      */
    var sync: js.UndefOr[Boolean] = js.native
  }
  object ReplaceOptions {
    
    @scala.inline
    def apply(file: String): ReplaceOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOptions]
    }
    
    @scala.inline
    implicit class ReplaceOptionsMutableBuilder[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean | ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setL(value: Boolean): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      @scala.inline
      def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      @scala.inline
      def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
      
      @scala.inline
      def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
      
      @scala.inline
      def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  type fields = Fields_
}
