package com.thaiopensource.relaxng.mns2;

import com.thaiopensource.relaxng.ValidatorHandler;
import org.xml.sax.SAXException;

abstract class NoResultAction extends Action {
  NoResultAction(ModeUsage modeUsage) {
    super(modeUsage);
  }

  abstract void perform(SectionState state) throws SAXException;
}