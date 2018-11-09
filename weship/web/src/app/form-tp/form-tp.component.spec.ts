import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormTpComponent } from './form-tp.component';

describe('FormTpComponent', () => {
  let component: FormTpComponent;
  let fixture: ComponentFixture<FormTpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormTpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormTpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
