package typingsSlinky.sharedb

import typingsSlinky.sharedb.mod.middleware.SnapshotType
import typingsSlinky.sharedb.sharedbMod.DocEvent
import typingsSlinky.sharedb.sharedbMod.OTType
import typingsSlinky.sharedb.sharedbMod.QueryEvent
import typingsSlinky.sharedb.sharedbMod.RequestAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedbStrings {
  
  @scala.inline
  def afterSubmit: afterSubmit = "afterSubmit".asInstanceOf[afterSubmit]
  
  @scala.inline
  def apply: apply = "apply".asInstanceOf[apply]
  
  @scala.inline
  def `before op`: `before op` = ("before op").asInstanceOf[`before op`]
  
  @scala.inline
  def bf: bf = "bf".asInstanceOf[bf]
  
  @scala.inline
  def bs: bs = "bs".asInstanceOf[bs]
  
  @scala.inline
  def bu: bu = "bu".asInstanceOf[bu]
  
  @scala.inline
  def byTimestamp: byTimestamp = "byTimestamp".asInstanceOf[byTimestamp]
  
  @scala.inline
  def byVersion: byVersion = "byVersion".asInstanceOf[byVersion]
  
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def commit: commit = "commit".asInstanceOf[commit]
  
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @scala.inline
  def del: del = "del".asInstanceOf[del]
  
  @scala.inline
  def doc: doc = "doc".asInstanceOf[doc]
  
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def extra: extra = "extra".asInstanceOf[extra]
  
  @scala.inline
  def f: f = "f".asInstanceOf[f]
  
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @scala.inline
  def nf: nf = "nf".asInstanceOf[nf]
  
  @scala.inline
  def `no write pending`: `no write pending` = ("no write pending").asInstanceOf[`no write pending`]
  
  @scala.inline
  def `nothing pending`: `nothing pending` = ("nothing pending").asInstanceOf[`nothing pending`]
  
  @scala.inline
  def nt: nt = "nt".asInstanceOf[nt]
  
  @scala.inline
  def op: op = "op".asInstanceOf[op]
  
  @scala.inline
  def `ot-json0`: `ot-json0` = "ot-json0".asInstanceOf[`ot-json0`]
  
  @scala.inline
  def `ot-json1`: `ot-json1` = "ot-json1".asInstanceOf[`ot-json1`]
  
  @scala.inline
  def `ot-text`: `ot-text` = "ot-text".asInstanceOf[`ot-text`]
  
  @scala.inline
  def `ot-text-tp2`: `ot-text-tp2` = "ot-text-tp2".asInstanceOf[`ot-text-tp2`]
  
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  
  @scala.inline
  def qf: qf = "qf".asInstanceOf[qf]
  
  @scala.inline
  def qs: qs = "qs".asInstanceOf[qs]
  
  @scala.inline
  def qu: qu = "qu".asInstanceOf[qu]
  
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @scala.inline
  def readSnapshots: readSnapshots = "readSnapshots".asInstanceOf[readSnapshots]
  
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @scala.inline
  def receive: receive = "receive".asInstanceOf[receive]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def reply: reply = "reply".asInstanceOf[reply]
  
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @scala.inline
  def `rich-text`: `rich-text` = "rich-text".asInstanceOf[`rich-text`]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def s: s = "s".asInstanceOf[s]
  
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @scala.inline
  def u: u = "u".asInstanceOf[u]
  
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
  
  @js.native
  sealed trait afterSubmit extends js.Object
  
  @js.native
  sealed trait apply extends js.Object
  
  @js.native
  sealed trait `before op` extends DocEvent
  
  @js.native
  sealed trait bf extends RequestAction
  
  @js.native
  sealed trait bs extends RequestAction
  
  @js.native
  sealed trait bu extends RequestAction
  
  @js.native
  sealed trait byTimestamp extends SnapshotType
  
  @js.native
  sealed trait byVersion extends SnapshotType
  
  @js.native
  sealed trait changed extends QueryEvent
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait commit extends js.Object
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait create extends DocEvent
  
  @js.native
  sealed trait current extends SnapshotType
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait del extends DocEvent
  
  @js.native
  sealed trait doc extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error
    extends DocEvent
       with QueryEvent
  
  @js.native
  sealed trait extra extends QueryEvent
  
  @js.native
  sealed trait f extends RequestAction
  
  @js.native
  sealed trait finish extends js.Object
  
  @js.native
  sealed trait insert extends QueryEvent
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait load extends DocEvent
  
  @js.native
  sealed trait move extends QueryEvent
  
  @js.native
  sealed trait nf extends RequestAction
  
  @js.native
  sealed trait `no write pending` extends DocEvent
  
  @js.native
  sealed trait `nothing pending` extends DocEvent
  
  @js.native
  sealed trait nt extends RequestAction
  
  @js.native
  sealed trait op
    extends DocEvent
       with RequestAction
  
  @js.native
  sealed trait `ot-json0` extends OTType
  
  @js.native
  sealed trait `ot-json1` extends OTType
  
  @js.native
  sealed trait `ot-text` extends OTType
  
  @js.native
  sealed trait `ot-text-tp2` extends OTType
  
  @js.native
  sealed trait pause extends js.Object
  
  @js.native
  sealed trait pipe extends js.Object
  
  @js.native
  sealed trait qf extends RequestAction
  
  @js.native
  sealed trait qs extends RequestAction
  
  @js.native
  sealed trait qu extends RequestAction
  
  @js.native
  sealed trait query extends js.Object
  
  @js.native
  sealed trait readSnapshots extends js.Object
  
  @js.native
  sealed trait readable extends js.Object
  
  @js.native
  sealed trait ready extends QueryEvent
  
  @js.native
  sealed trait receive extends js.Object
  
  @js.native
  sealed trait remove extends QueryEvent
  
  @js.native
  sealed trait reply extends js.Object
  
  @js.native
  sealed trait resume extends js.Object
  
  @js.native
  sealed trait `rich-text` extends OTType
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait s extends RequestAction
  
  @js.native
  sealed trait submit extends js.Object
  
  @js.native
  sealed trait u extends RequestAction
  
  @js.native
  sealed trait unpipe extends js.Object
}
