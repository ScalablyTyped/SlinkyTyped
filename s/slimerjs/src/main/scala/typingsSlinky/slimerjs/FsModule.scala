package typingsSlinky.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsModule extends js.Object {
  var separator: String = js.native
  var workingDirectory: String = js.native
  def absolute(path: String): String = js.native
  def base(path: String): String = js.native
  def basename(path: String): String = js.native
  def changeWorkingDirectory(path: String): Unit = js.native
  def copy(source: String, target: String): Unit = js.native
  def copyTree(source: String, target: String): Unit = js.native
  def directory(path: String): String = js.native
  def dirname(path: String): String = js.native
  def exists(path: String): Boolean = js.native
  def extension(path: String, withoutdot: Boolean): String = js.native
  def isAbsolute(path: String): Boolean = js.native
  def isDirectory(path: String): Boolean = js.native
  def isExecutable(path: String): Boolean = js.native
  def isFile(path: String): Boolean = js.native
  def isLink(path: String): Boolean = js.native
  def isReadable(path: String): Boolean = js.native
  def isWritable(path: String): Boolean = js.native
  // last argument should be the filename
  def join(basepath: String, dirname: String, args: String*): String = js.native
  def lastModified(path: String): js.Date = js.native
  def list(path: String): js.Array[String] = js.native
  def makeDirectory(path: String): Unit = js.native
  def makeTree(path: String): Unit = js.native
  def mkpath(path: String): Unit = js.native
  def move(source: String, target: String): Unit = js.native
  def open(filename: String, opts: Opts): Unit = js.native
  def read(path: String, mode: String): String = js.native
  def readLink(path: String): String = js.native
  def remove(path: String): Unit = js.native
  def removeDirectory(path: String): Unit = js.native
  def removeTree(path: String): Unit = js.native
  def rename(path: String, newname: String): Unit = js.native
  def rmdir(path: String): Unit = js.native
  def size(path: String): Double = js.native
  def split(path: String): js.Array[String] = js.native
  def touch(path: String, date: js.Date): Unit = js.native
  /*
    Mode is a string that can contain character which describes a characteristic of the returned stream.
    If the string contains "r", the file is opened in read-only mode.
    "w" opens the file in write-only mode.
    "b" opens the file in binary mode. If "b" is not present, the file is
    opened in text mode, and its contents are assumed to be UTF-8.
    "a" means to open as "append" mode: the file is open in write-only mode and all written character are append to the file
    */
  def write(path: String, content: js.Any, mode: String): Unit = js.native
}

object FsModule {
  @scala.inline
  def apply(
    absolute: String => String,
    base: String => String,
    basename: String => String,
    changeWorkingDirectory: String => Unit,
    copy: (String, String) => Unit,
    copyTree: (String, String) => Unit,
    directory: String => String,
    dirname: String => String,
    exists: String => Boolean,
    extension: (String, Boolean) => String,
    isAbsolute: String => Boolean,
    isDirectory: String => Boolean,
    isExecutable: String => Boolean,
    isFile: String => Boolean,
    isLink: String => Boolean,
    isReadable: String => Boolean,
    isWritable: String => Boolean,
    join: (String, String, /* repeated */ String) => String,
    lastModified: String => js.Date,
    list: String => js.Array[String],
    makeDirectory: String => Unit,
    makeTree: String => Unit,
    mkpath: String => Unit,
    move: (String, String) => Unit,
    open: (String, Opts) => Unit,
    read: (String, String) => String,
    readLink: String => String,
    remove: String => Unit,
    removeDirectory: String => Unit,
    removeTree: String => Unit,
    rename: (String, String) => Unit,
    rmdir: String => Unit,
    separator: String,
    size: String => Double,
    split: String => js.Array[String],
    touch: (String, js.Date) => Unit,
    workingDirectory: String,
    write: (String, js.Any, String) => Unit
  ): FsModule = {
    val __obj = js.Dynamic.literal(absolute = js.Any.fromFunction1(absolute), base = js.Any.fromFunction1(base), basename = js.Any.fromFunction1(basename), changeWorkingDirectory = js.Any.fromFunction1(changeWorkingDirectory), copy = js.Any.fromFunction2(copy), copyTree = js.Any.fromFunction2(copyTree), directory = js.Any.fromFunction1(directory), dirname = js.Any.fromFunction1(dirname), exists = js.Any.fromFunction1(exists), extension = js.Any.fromFunction2(extension), isAbsolute = js.Any.fromFunction1(isAbsolute), isDirectory = js.Any.fromFunction1(isDirectory), isExecutable = js.Any.fromFunction1(isExecutable), isFile = js.Any.fromFunction1(isFile), isLink = js.Any.fromFunction1(isLink), isReadable = js.Any.fromFunction1(isReadable), isWritable = js.Any.fromFunction1(isWritable), join = js.Any.fromFunction3(join), lastModified = js.Any.fromFunction1(lastModified), list = js.Any.fromFunction1(list), makeDirectory = js.Any.fromFunction1(makeDirectory), makeTree = js.Any.fromFunction1(makeTree), mkpath = js.Any.fromFunction1(mkpath), move = js.Any.fromFunction2(move), open = js.Any.fromFunction2(open), read = js.Any.fromFunction2(read), readLink = js.Any.fromFunction1(readLink), remove = js.Any.fromFunction1(remove), removeDirectory = js.Any.fromFunction1(removeDirectory), removeTree = js.Any.fromFunction1(removeTree), rename = js.Any.fromFunction2(rename), rmdir = js.Any.fromFunction1(rmdir), separator = separator.asInstanceOf[js.Any], size = js.Any.fromFunction1(size), split = js.Any.fromFunction1(split), touch = js.Any.fromFunction2(touch), workingDirectory = workingDirectory.asInstanceOf[js.Any], write = js.Any.fromFunction3(write))
    __obj.asInstanceOf[FsModule]
  }
  @scala.inline
  implicit class FsModuleOps[Self <: FsModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBase(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBasename(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChangeWorkingDirectory(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeWorkingDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopyTree(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTree")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDirectory(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDirname(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtension(value: (String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsAbsolute(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAbsolute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDirectory(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsExecutable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExecutable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFile(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLink(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsReadable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsWritable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWritable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJoin(value: (String, String, /* repeated */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLastModified(value: String => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeDirectory(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeTree(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeTree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMkpath(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkpath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpen(value: (String, Opts) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRead(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReadLink(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveDirectory(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveTree(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRename(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRmdir(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdir")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplit(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTouch(value: (String, js.Date) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWorkingDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: (String, js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

