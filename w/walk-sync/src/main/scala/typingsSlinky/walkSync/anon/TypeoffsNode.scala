package typingsSlinky.walkSync.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.EmitClose
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.Interval
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.anon.Persistent
import typingsSlinky.node.anon.Recursive
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.anon.`3`
import typingsSlinky.node.fsMod.BaseEncodingOptions
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.BufferEncodingOption
import typingsSlinky.node.fsMod.Dir
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.OpenDirOptions
import typingsSlinky.node.fsMod.OpenMode
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.node.fsMod.ReadSyncOptions
import typingsSlinky.node.fsMod.RmDirOptions
import typingsSlinky.node.fsMod.RmOptions
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.fsMod.WriteFileOptions
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.node.fsMod.symlink.Type
import typingsSlinky.walkSync.walkSyncStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoffsNode extends js.Object {
  
  var BigIntStats: Instantiable0[typingsSlinky.node.fsMod.BigIntStats] = js.native
  
  var Dir: Instantiable0[typingsSlinky.node.fsMod.Dir] = js.native
  
  var Dirent: Instantiable0[typingsSlinky.node.fsMod.Dirent] = js.native
  
  var ReadStream: Instantiable0[typingsSlinky.node.fsMod.ReadStream] = js.native
  
  var Stats: Instantiable0[typingsSlinky.node.fsMod.Stats] = js.native
  
  var WriteStream: Instantiable0[typingsSlinky.node.fsMod.WriteStream] = js.native
  
  val access: Typeofaccess = js.native
  
  def accessSync(path: PathLike): Unit = js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  
  val appendFile: TypeofappendFile = js.native
  
  def appendFileSync(file: Double, data: String): Unit = js.native
  def appendFileSync(file: Double, data: String, options: WriteFileOptions): Unit = js.native
  def appendFileSync(file: Double, data: js.typedarray.Uint8Array): Unit = js.native
  def appendFileSync(file: Double, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  def appendFileSync(file: PathLike, data: String): Unit = js.native
  def appendFileSync(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  def appendFileSync(file: PathLike, data: js.typedarray.Uint8Array): Unit = js.native
  def appendFileSync(file: PathLike, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  
  val chmod: Typeofchmod = js.native
  
  def chmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  val chown: Typeofchown = js.native
  
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  val close: Typeofclose = js.native
  
  def closeSync(fd: Double): Unit = js.native
  
  val constants: Typeofconstants = js.native
  
  val copyFile: TypeofcopyFile = js.native
  
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
  
  def createReadStream(path: PathLike): ReadStream = js.native
  def createReadStream(path: PathLike, options: String): ReadStream = js.native
  def createReadStream(path: PathLike, options: AutoClose): ReadStream = js.native
  
  def createWriteStream(path: PathLike): WriteStream = js.native
  def createWriteStream(path: PathLike, options: String): WriteStream = js.native
  def createWriteStream(path: PathLike, options: EmitClose): WriteStream = js.native
  
  val exists: Typeofexists = js.native
  
  def existsSync(path: PathLike): Boolean = js.native
  
  val fchmod: Typeoffchmod = js.native
  
  def fchmodSync(fd: Double, mode: Mode): Unit = js.native
  
  val fchown: Typeoffchown = js.native
  
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  val fdatasync: Typeoffdatasync = js.native
  
  def fdatasyncSync(fd: Double): Unit = js.native
  
  val fstat: Typeoffstat = js.native
  
  def fstatSync(fd: Double): Stats = js.native
  
  val fsync: Typeoffsync = js.native
  
  def fsyncSync(fd: Double): Unit = js.native
  
  val ftruncate: Typeofftruncate = js.native
  
  def ftruncateSync(fd: Double): Unit = js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  val futimes: Typeoffutimes = js.native
  
  def futimesSync(fd: Double, atime: String, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: js.Date): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: js.Date): Unit = js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: js.Date, mtime: js.Date): Unit = js.native
  
  val lchmod: Typeoflchmod = js.native
  
  def lchmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  val lchown: Typeoflchown = js.native
  
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  val link: Typeoflink = js.native
  
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  
  val lstat: Typeoflstat = js.native
  
  def lstatSync(path: PathLike): Stats = js.native
  
  val lutimes: Typeoflutimes = js.native
  
  def lutimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
  def lutimesSync(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
  def lutimesSync(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
  def lutimesSync(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
  
  val mkdir: Typeofmkdir = js.native
  
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
  
  val mkdtemp: Typeofmkdtemp = js.native
  
  def mkdtempSync(prefix: String): String = js.native
  def mkdtempSync(prefix: String, options: String): String | Buffer = js.native
  def mkdtempSync(prefix: String, options: BufferEncoding): String = js.native
  def mkdtempSync(prefix: String, options: BaseEncodingOptions): String = js.native
  def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_Union(prefix: String): String | Buffer = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_Union(prefix: String, options: BaseEncodingOptions): String | Buffer = js.native
  
  val open: Typeofopen = js.native
  
  def openSync(path: PathLike, flags: OpenMode): Double = js.native
  def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  
  val opendir: Typeofopendir = js.native
  
  def opendirSync(path: String): Dir = js.native
  def opendirSync(path: String, options: OpenDirOptions): Dir = js.native
  
  val promises: Typeofpromises = js.native
  
  val read: Typeofread = js.native
  
  val readFile: TypeofreadFile = js.native
  
  def readFileSync(path: Double): String | Buffer = js.native
  def readFileSync(path: Double, options: BufferEncoding): String = js.native
  def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
  def readFileSync(path: Double, options: `3`): Buffer = js.native
  def readFileSync(path: PathLike): String | Buffer = js.native
  def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
  def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
  def readFileSync(path: PathLike, options: `3`): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: Double): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: PathLike): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
  
  def readSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
  
  val readdir: Typeofreaddir = js.native
  
  def readdirSync(path: PathLike): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  
  val readlink: Typeofreadlink = js.native
  
  def readlinkSync(path: PathLike): String = js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  def readlinkSync(path: PathLike, options: BaseEncodingOptions): String = js.native
  def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  @JSName("readlinkSync")
  def readlinkSync_Union(path: PathLike): String | Buffer = js.native
  @JSName("readlinkSync")
  def readlinkSync_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  
  val readv: Typeofreadv = js.native
  
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  
  val realpath: Typeofrealpath = js.native
  
  val realpathSync: TypeofrealpathSync = js.native
  
  val rename: Typeofrename = js.native
  
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  
  val rm: Typeofrm = js.native
  
  def rmSync(path: PathLike): Unit = js.native
  def rmSync(path: PathLike, options: RmOptions): Unit = js.native
  
  val rmdir: Typeofrmdir = js.native
  
  def rmdirSync(path: PathLike): Unit = js.native
  def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
  
  val stat: Typeofstat = js.native
  
  def statSync(path: PathLike): Stats = js.native
  def statSync(path: PathLike, options: BigIntOptions): BigIntStats = js.native
  def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  
  val symlink: Typeofsymlink = js.native
  
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  
  val truncate: Typeoftruncate = js.native
  
  def truncateSync(path: PathLike): Unit = js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  
  val unlink: Typeofunlink = js.native
  
  def unlinkSync(path: PathLike): Unit = js.native
  
  def unwatchFile(filename: PathLike): Unit = js.native
  def unwatchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  
  val utimes: Typeofutimes = js.native
  
  def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
  
  def watch(filename: PathLike): FSWatcher = js.native
  def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: String): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: Persistent): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Persistent,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: Recursive): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Recursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  def watchFile(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
  @JSName("watch")
  def watch_buffer(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  val write: Typeofwrite = js.native
  
  val writeFile: TypeofwriteFile = js.native
  
  def writeFileSync(path: Double, data: String): Unit = js.native
  def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: Double, data: ArrayBufferView): Unit = js.native
  def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: PathLike, data: String): Unit = js.native
  def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView): Unit = js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, string: String): Double = js.native
  def writeSync(fd: Double, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  def writeSync(fd: Double, string: String, position: Double): Double = js.native
  def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
  def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
  
  val writev: Typeofwritev = js.native
  
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
}
