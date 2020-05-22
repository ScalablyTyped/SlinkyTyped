package typingsSlinky.wordpressEditor.anon

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.Props
import typingsSlinky.wordpressEditor.wordpressEditorStrings.`object`
import typingsSlinky.wordpressEditor.wordpressEditorStrings.`var`
import typingsSlinky.wordpressEditor.wordpressEditorStrings.a
import typingsSlinky.wordpressEditor.wordpressEditorStrings.abbr
import typingsSlinky.wordpressEditor.wordpressEditorStrings.address
import typingsSlinky.wordpressEditor.wordpressEditorStrings.applet
import typingsSlinky.wordpressEditor.wordpressEditorStrings.area
import typingsSlinky.wordpressEditor.wordpressEditorStrings.article
import typingsSlinky.wordpressEditor.wordpressEditorStrings.aside
import typingsSlinky.wordpressEditor.wordpressEditorStrings.audio
import typingsSlinky.wordpressEditor.wordpressEditorStrings.b
import typingsSlinky.wordpressEditor.wordpressEditorStrings.base
import typingsSlinky.wordpressEditor.wordpressEditorStrings.basefont
import typingsSlinky.wordpressEditor.wordpressEditorStrings.bdi
import typingsSlinky.wordpressEditor.wordpressEditorStrings.bdo
import typingsSlinky.wordpressEditor.wordpressEditorStrings.blockquote
import typingsSlinky.wordpressEditor.wordpressEditorStrings.body
import typingsSlinky.wordpressEditor.wordpressEditorStrings.br
import typingsSlinky.wordpressEditor.wordpressEditorStrings.button
import typingsSlinky.wordpressEditor.wordpressEditorStrings.canvas
import typingsSlinky.wordpressEditor.wordpressEditorStrings.caption
import typingsSlinky.wordpressEditor.wordpressEditorStrings.cite
import typingsSlinky.wordpressEditor.wordpressEditorStrings.code
import typingsSlinky.wordpressEditor.wordpressEditorStrings.col
import typingsSlinky.wordpressEditor.wordpressEditorStrings.colgroup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.data
import typingsSlinky.wordpressEditor.wordpressEditorStrings.datalist
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dd
import typingsSlinky.wordpressEditor.wordpressEditorStrings.del
import typingsSlinky.wordpressEditor.wordpressEditorStrings.details
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dfn
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dialog
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dir
import typingsSlinky.wordpressEditor.wordpressEditorStrings.div
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dl
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dt
import typingsSlinky.wordpressEditor.wordpressEditorStrings.em
import typingsSlinky.wordpressEditor.wordpressEditorStrings.embed
import typingsSlinky.wordpressEditor.wordpressEditorStrings.fieldset
import typingsSlinky.wordpressEditor.wordpressEditorStrings.figcaption
import typingsSlinky.wordpressEditor.wordpressEditorStrings.figure
import typingsSlinky.wordpressEditor.wordpressEditorStrings.font
import typingsSlinky.wordpressEditor.wordpressEditorStrings.footer
import typingsSlinky.wordpressEditor.wordpressEditorStrings.form
import typingsSlinky.wordpressEditor.wordpressEditorStrings.frame
import typingsSlinky.wordpressEditor.wordpressEditorStrings.frameset
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h1
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h2
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h3
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h4
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h5
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h6
import typingsSlinky.wordpressEditor.wordpressEditorStrings.head
import typingsSlinky.wordpressEditor.wordpressEditorStrings.header
import typingsSlinky.wordpressEditor.wordpressEditorStrings.hgroup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.hr
import typingsSlinky.wordpressEditor.wordpressEditorStrings.html
import typingsSlinky.wordpressEditor.wordpressEditorStrings.i
import typingsSlinky.wordpressEditor.wordpressEditorStrings.iframe
import typingsSlinky.wordpressEditor.wordpressEditorStrings.img
import typingsSlinky.wordpressEditor.wordpressEditorStrings.input
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ins
import typingsSlinky.wordpressEditor.wordpressEditorStrings.kbd
import typingsSlinky.wordpressEditor.wordpressEditorStrings.label
import typingsSlinky.wordpressEditor.wordpressEditorStrings.legend
import typingsSlinky.wordpressEditor.wordpressEditorStrings.li
import typingsSlinky.wordpressEditor.wordpressEditorStrings.link
import typingsSlinky.wordpressEditor.wordpressEditorStrings.main
import typingsSlinky.wordpressEditor.wordpressEditorStrings.map
import typingsSlinky.wordpressEditor.wordpressEditorStrings.mark
import typingsSlinky.wordpressEditor.wordpressEditorStrings.marquee
import typingsSlinky.wordpressEditor.wordpressEditorStrings.menu
import typingsSlinky.wordpressEditor.wordpressEditorStrings.meta
import typingsSlinky.wordpressEditor.wordpressEditorStrings.meter
import typingsSlinky.wordpressEditor.wordpressEditorStrings.nav
import typingsSlinky.wordpressEditor.wordpressEditorStrings.noscript
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ol
import typingsSlinky.wordpressEditor.wordpressEditorStrings.optgroup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.option
import typingsSlinky.wordpressEditor.wordpressEditorStrings.output
import typingsSlinky.wordpressEditor.wordpressEditorStrings.p
import typingsSlinky.wordpressEditor.wordpressEditorStrings.param
import typingsSlinky.wordpressEditor.wordpressEditorStrings.picture
import typingsSlinky.wordpressEditor.wordpressEditorStrings.pre
import typingsSlinky.wordpressEditor.wordpressEditorStrings.progress
import typingsSlinky.wordpressEditor.wordpressEditorStrings.q
import typingsSlinky.wordpressEditor.wordpressEditorStrings.rp
import typingsSlinky.wordpressEditor.wordpressEditorStrings.rt
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ruby
import typingsSlinky.wordpressEditor.wordpressEditorStrings.s
import typingsSlinky.wordpressEditor.wordpressEditorStrings.samp
import typingsSlinky.wordpressEditor.wordpressEditorStrings.script
import typingsSlinky.wordpressEditor.wordpressEditorStrings.section
import typingsSlinky.wordpressEditor.wordpressEditorStrings.select
import typingsSlinky.wordpressEditor.wordpressEditorStrings.slot
import typingsSlinky.wordpressEditor.wordpressEditorStrings.small
import typingsSlinky.wordpressEditor.wordpressEditorStrings.source
import typingsSlinky.wordpressEditor.wordpressEditorStrings.span
import typingsSlinky.wordpressEditor.wordpressEditorStrings.strong
import typingsSlinky.wordpressEditor.wordpressEditorStrings.style
import typingsSlinky.wordpressEditor.wordpressEditorStrings.sub
import typingsSlinky.wordpressEditor.wordpressEditorStrings.summary
import typingsSlinky.wordpressEditor.wordpressEditorStrings.sup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.table
import typingsSlinky.wordpressEditor.wordpressEditorStrings.tbody
import typingsSlinky.wordpressEditor.wordpressEditorStrings.td
import typingsSlinky.wordpressEditor.wordpressEditorStrings.template
import typingsSlinky.wordpressEditor.wordpressEditorStrings.textarea
import typingsSlinky.wordpressEditor.wordpressEditorStrings.tfoot
import typingsSlinky.wordpressEditor.wordpressEditorStrings.th
import typingsSlinky.wordpressEditor.wordpressEditorStrings.thead
import typingsSlinky.wordpressEditor.wordpressEditorStrings.time
import typingsSlinky.wordpressEditor.wordpressEditorStrings.title
import typingsSlinky.wordpressEditor.wordpressEditorStrings.tr
import typingsSlinky.wordpressEditor.wordpressEditorStrings.track
import typingsSlinky.wordpressEditor.wordpressEditorStrings.u
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ul
import typingsSlinky.wordpressEditor.wordpressEditorStrings.video
import typingsSlinky.wordpressEditor.wordpressEditorStrings.wbr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  def apply(
    props: Props[
      a | abbr | address | applet | area | article | aside | audio | b | base | basefont | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | dir | div | dl | dt | em | embed | fieldset | figcaption | figure | font | footer | form | frame | frameset | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | marquee | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | param | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
    ]
  ): ReactElement = js.native
  /**
    * Should be used in the `save` function of your block to correctly save rich text content.
    */
  @JSName("Content")
  def Content_a(props: ContentProps[a]): ReactElement = js.native
  @JSName("Content")
  def Content_abbr(props: ContentProps[abbr]): ReactElement = js.native
  @JSName("Content")
  def Content_address(props: ContentProps[address]): ReactElement = js.native
  @JSName("Content")
  def Content_applet(props: ContentProps[applet]): ReactElement = js.native
  @JSName("Content")
  def Content_area(props: ContentProps[area]): ReactElement = js.native
  @JSName("Content")
  def Content_article(props: ContentProps[article]): ReactElement = js.native
  @JSName("Content")
  def Content_aside(props: ContentProps[aside]): ReactElement = js.native
  @JSName("Content")
  def Content_audio(props: ContentProps[audio]): ReactElement = js.native
  @JSName("Content")
  def Content_b(props: ContentProps[b]): ReactElement = js.native
  @JSName("Content")
  def Content_base(props: ContentProps[base]): ReactElement = js.native
  @JSName("Content")
  def Content_basefont(props: ContentProps[basefont]): ReactElement = js.native
  @JSName("Content")
  def Content_bdi(props: ContentProps[bdi]): ReactElement = js.native
  @JSName("Content")
  def Content_bdo(props: ContentProps[bdo]): ReactElement = js.native
  @JSName("Content")
  def Content_blockquote(props: ContentProps[blockquote]): ReactElement = js.native
  @JSName("Content")
  def Content_body(props: ContentProps[body]): ReactElement = js.native
  @JSName("Content")
  def Content_br(props: ContentProps[br]): ReactElement = js.native
  @JSName("Content")
  def Content_button(props: ContentProps[button]): ReactElement = js.native
  @JSName("Content")
  def Content_canvas(props: ContentProps[canvas]): ReactElement = js.native
  @JSName("Content")
  def Content_caption(props: ContentProps[caption]): ReactElement = js.native
  @JSName("Content")
  def Content_cite(props: ContentProps[cite]): ReactElement = js.native
  @JSName("Content")
  def Content_code(props: ContentProps[code]): ReactElement = js.native
  @JSName("Content")
  def Content_col(props: ContentProps[col]): ReactElement = js.native
  @JSName("Content")
  def Content_colgroup(props: ContentProps[colgroup]): ReactElement = js.native
  @JSName("Content")
  def Content_data(props: ContentProps[data]): ReactElement = js.native
  @JSName("Content")
  def Content_datalist(props: ContentProps[datalist]): ReactElement = js.native
  @JSName("Content")
  def Content_dd(props: ContentProps[dd]): ReactElement = js.native
  @JSName("Content")
  def Content_del(props: ContentProps[del]): ReactElement = js.native
  @JSName("Content")
  def Content_details(props: ContentProps[details]): ReactElement = js.native
  @JSName("Content")
  def Content_dfn(props: ContentProps[dfn]): ReactElement = js.native
  @JSName("Content")
  def Content_dialog(props: ContentProps[dialog]): ReactElement = js.native
  @JSName("Content")
  def Content_dir(props: ContentProps[dir]): ReactElement = js.native
  @JSName("Content")
  def Content_div(props: ContentProps[div]): ReactElement = js.native
  @JSName("Content")
  def Content_dl(props: ContentProps[dl]): ReactElement = js.native
  @JSName("Content")
  def Content_dt(props: ContentProps[dt]): ReactElement = js.native
  @JSName("Content")
  def Content_em(props: ContentProps[em]): ReactElement = js.native
  @JSName("Content")
  def Content_embed(props: ContentProps[embed]): ReactElement = js.native
  @JSName("Content")
  def Content_fieldset(props: ContentProps[fieldset]): ReactElement = js.native
  @JSName("Content")
  def Content_figcaption(props: ContentProps[figcaption]): ReactElement = js.native
  @JSName("Content")
  def Content_figure(props: ContentProps[figure]): ReactElement = js.native
  @JSName("Content")
  def Content_font(props: ContentProps[font]): ReactElement = js.native
  @JSName("Content")
  def Content_footer(props: ContentProps[footer]): ReactElement = js.native
  @JSName("Content")
  def Content_form(props: ContentProps[form]): ReactElement = js.native
  @JSName("Content")
  def Content_frame(props: ContentProps[frame]): ReactElement = js.native
  @JSName("Content")
  def Content_frameset(props: ContentProps[frameset]): ReactElement = js.native
  @JSName("Content")
  def Content_h1(props: ContentProps[h1]): ReactElement = js.native
  @JSName("Content")
  def Content_h2(props: ContentProps[h2]): ReactElement = js.native
  @JSName("Content")
  def Content_h3(props: ContentProps[h3]): ReactElement = js.native
  @JSName("Content")
  def Content_h4(props: ContentProps[h4]): ReactElement = js.native
  @JSName("Content")
  def Content_h5(props: ContentProps[h5]): ReactElement = js.native
  @JSName("Content")
  def Content_h6(props: ContentProps[h6]): ReactElement = js.native
  @JSName("Content")
  def Content_head(props: ContentProps[head]): ReactElement = js.native
  @JSName("Content")
  def Content_header(props: ContentProps[header]): ReactElement = js.native
  @JSName("Content")
  def Content_hgroup(props: ContentProps[hgroup]): ReactElement = js.native
  @JSName("Content")
  def Content_hr(props: ContentProps[hr]): ReactElement = js.native
  @JSName("Content")
  def Content_html(props: ContentProps[html]): ReactElement = js.native
  @JSName("Content")
  def Content_i(props: ContentProps[i]): ReactElement = js.native
  @JSName("Content")
  def Content_iframe(props: ContentProps[iframe]): ReactElement = js.native
  @JSName("Content")
  def Content_img(props: ContentProps[img]): ReactElement = js.native
  @JSName("Content")
  def Content_input(props: ContentProps[input]): ReactElement = js.native
  @JSName("Content")
  def Content_ins(props: ContentProps[ins]): ReactElement = js.native
  @JSName("Content")
  def Content_kbd(props: ContentProps[kbd]): ReactElement = js.native
  @JSName("Content")
  def Content_label(props: ContentProps[label]): ReactElement = js.native
  @JSName("Content")
  def Content_legend(props: ContentProps[legend]): ReactElement = js.native
  @JSName("Content")
  def Content_li(props: ContentProps[li]): ReactElement = js.native
  @JSName("Content")
  def Content_link(props: ContentProps[link]): ReactElement = js.native
  @JSName("Content")
  def Content_main(props: ContentProps[main]): ReactElement = js.native
  @JSName("Content")
  def Content_map(props: ContentProps[map]): ReactElement = js.native
  @JSName("Content")
  def Content_mark(props: ContentProps[mark]): ReactElement = js.native
  @JSName("Content")
  def Content_marquee(props: ContentProps[marquee]): ReactElement = js.native
  @JSName("Content")
  def Content_menu(props: ContentProps[menu]): ReactElement = js.native
  @JSName("Content")
  def Content_meta(props: ContentProps[meta]): ReactElement = js.native
  @JSName("Content")
  def Content_meter(props: ContentProps[meter]): ReactElement = js.native
  @JSName("Content")
  def Content_nav(props: ContentProps[nav]): ReactElement = js.native
  @JSName("Content")
  def Content_noscript(props: ContentProps[noscript]): ReactElement = js.native
  @JSName("Content")
  def Content_object(props: ContentProps[`object`]): ReactElement = js.native
  @JSName("Content")
  def Content_ol(props: ContentProps[ol]): ReactElement = js.native
  @JSName("Content")
  def Content_optgroup(props: ContentProps[optgroup]): ReactElement = js.native
  @JSName("Content")
  def Content_option(props: ContentProps[option]): ReactElement = js.native
  @JSName("Content")
  def Content_output(props: ContentProps[output]): ReactElement = js.native
  @JSName("Content")
  def Content_p(props: ContentProps[p]): ReactElement = js.native
  @JSName("Content")
  def Content_param(props: ContentProps[param]): ReactElement = js.native
  @JSName("Content")
  def Content_picture(props: ContentProps[picture]): ReactElement = js.native
  @JSName("Content")
  def Content_pre(props: ContentProps[pre]): ReactElement = js.native
  @JSName("Content")
  def Content_progress(props: ContentProps[progress]): ReactElement = js.native
  @JSName("Content")
  def Content_q(props: ContentProps[q]): ReactElement = js.native
  @JSName("Content")
  def Content_rp(props: ContentProps[rp]): ReactElement = js.native
  @JSName("Content")
  def Content_rt(props: ContentProps[rt]): ReactElement = js.native
  @JSName("Content")
  def Content_ruby(props: ContentProps[ruby]): ReactElement = js.native
  @JSName("Content")
  def Content_s(props: ContentProps[s]): ReactElement = js.native
  @JSName("Content")
  def Content_samp(props: ContentProps[samp]): ReactElement = js.native
  @JSName("Content")
  def Content_script(props: ContentProps[script]): ReactElement = js.native
  @JSName("Content")
  def Content_section(props: ContentProps[section]): ReactElement = js.native
  @JSName("Content")
  def Content_select(props: ContentProps[select]): ReactElement = js.native
  @JSName("Content")
  def Content_slot(props: ContentProps[slot]): ReactElement = js.native
  @JSName("Content")
  def Content_small(props: ContentProps[small]): ReactElement = js.native
  @JSName("Content")
  def Content_source(props: ContentProps[source]): ReactElement = js.native
  @JSName("Content")
  def Content_span(props: ContentProps[span]): ReactElement = js.native
  @JSName("Content")
  def Content_strong(props: ContentProps[strong]): ReactElement = js.native
  @JSName("Content")
  def Content_style(props: ContentProps[style]): ReactElement = js.native
  @JSName("Content")
  def Content_sub(props: ContentProps[sub]): ReactElement = js.native
  @JSName("Content")
  def Content_summary(props: ContentProps[summary]): ReactElement = js.native
  @JSName("Content")
  def Content_sup(props: ContentProps[sup]): ReactElement = js.native
  @JSName("Content")
  def Content_table(props: ContentProps[table]): ReactElement = js.native
  @JSName("Content")
  def Content_tbody(props: ContentProps[tbody]): ReactElement = js.native
  @JSName("Content")
  def Content_td(props: ContentProps[td]): ReactElement = js.native
  @JSName("Content")
  def Content_template(props: ContentProps[template]): ReactElement = js.native
  @JSName("Content")
  def Content_textarea(props: ContentProps[textarea]): ReactElement = js.native
  @JSName("Content")
  def Content_tfoot(props: ContentProps[tfoot]): ReactElement = js.native
  @JSName("Content")
  def Content_th(props: ContentProps[th]): ReactElement = js.native
  @JSName("Content")
  def Content_thead(props: ContentProps[thead]): ReactElement = js.native
  @JSName("Content")
  def Content_time(props: ContentProps[time]): ReactElement = js.native
  @JSName("Content")
  def Content_title(props: ContentProps[title]): ReactElement = js.native
  @JSName("Content")
  def Content_tr(props: ContentProps[tr]): ReactElement = js.native
  @JSName("Content")
  def Content_track(props: ContentProps[track]): ReactElement = js.native
  @JSName("Content")
  def Content_u(props: ContentProps[u]): ReactElement = js.native
  @JSName("Content")
  def Content_ul(props: ContentProps[ul]): ReactElement = js.native
  @JSName("Content")
  def Content_var(props: ContentProps[`var`]): ReactElement = js.native
  @JSName("Content")
  def Content_video(props: ContentProps[video]): ReactElement = js.native
  @JSName("Content")
  def Content_wbr(props: ContentProps[wbr]): ReactElement = js.native
  def isEmpty(value: String): Boolean = js.native
  def isEmpty(value: js.Array[String]): Boolean = js.native
}

