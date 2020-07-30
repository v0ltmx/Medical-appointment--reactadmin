import React from 'react';
import {

  List,
  Datagrid,
  TextField,
  Create,
  SimpleForm,
  TextInput,
  Edit,
} from 'react-admin';
const PatientsList = props => (
  <List {...props}>
    <Datagrid rowClick="edit">
      <TextField source="id" />
      <TextField source="nome" />
    </Datagrid>
  </List>
);

const PatientEdit = props => (
  <Edit title={<span>Edit Patient</span>} {...props}>
    <SimpleForm>
      <TextInput source="name" />
         </SimpleForm>
  </Edit>
);

const PatientsCreate = props => (
  <Create title={<span>Inserir Paciente</span>} {...props}>
    <SimpleForm>
      <TextInput source="name" label="nome"/>
          <TextInput source="id" label="id" />
    </SimpleForm>
  </Create>
);

export {PatientsList, PatientEdit, PatientsCreate};